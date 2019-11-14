package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * �����ҷ����
 * @author Administrator
 */
public class Server {
	/**
	 * java.net.ServerSocket
	 * �����ڷ���˵�ServerSocket��Ҫ����������
	 * 1����ϵͳ����˿ڣ��ͻ��˾���ͨ������˿������˳��������ӵ�
	 * 2�������ö˿ڣ�һ��һ���ͻ���ͨ���ö˿���������ʱ���Զ�����һ��
	 *   Socketʵ������ô����˾Ϳ���ͨ�����Socket��ͻ��˽��н����ˡ�
	 */
	private ServerSocket server;
	/**
	 * �����ڲ�����Է����ⲿ������ԣ���������ClientHandler�����Կ���
	 * Server��������ԣ����ʹ������������ڱ�������ClientHandler
	 * ��Ӧ�ͻ��˵���������Ա�����֮��㲥���Կͻ��˷��͹�������Ϣ�����пͻ��ˡ�
	 */
//	private PrintWriter[] allOut={};
	private Collection<PrintWriter> allOut
		=new ArrayList<>();
	/**
	 * ���췽����������ʼ�������
	 */
	public Server(){
		try {
			System.out.println("�������������...");
			server=new ServerSocket(8088);
			System.out.println("�������������");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * �������������
	 */
	public void start(){
		try {
			/**
			 * ServerSocket
			 * Socket accept()
			 * ��һ����������,���û�����������״̬����ʱ��ȴ��ͻ��˵����ӣ�һ��һ��
			 * �ͻ���ͨ��Socket��������ʱ����ô�÷�������������һ��Socketʵ��
			 * ͨ�����Socket������ս������ӵĿͻ��˽��н�������
			 * ��ε��ø÷������Խ��ܶ���ͻ��˵����ӡ�
			 */
			while(true){
				System.out.println("�ȴ��ͻ�������...");
				Socket socket=server.accept();
				System.out.println("һ���ͻ���������");
			//����һ���߳���������ͻ��˽���
				ClientHandler handler=new ClientHandler(socket);
				Thread t=new Thread(handler);
				t.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server server=new Server();
		server.start();
	}
	/**
	 * ���̸߳�����ָ���ͻ��˽���
	 * @author Administrator
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		private String host;    //Զ�˼������ַ��Ϣ
		public ClientHandler(Socket socket){
			this.socket=socket;
			InetAddress address=socket.getInetAddress();
			host=address.getHostAddress();
		}
		public void run() {
			System.out.println("������һ���̣߳�");
			String say[]={"��","˵","��"};
			int num=(int)(Math.random()*3);
			PrintWriter pw=null;
			try {
				//ͨ��socket��������������ڸ��ͻ��˷���Ϣ
				pw=new PrintWriter(
					new BufferedWriter(
						new OutputStreamWriter(
							socket.getOutputStream(),"utf-8"
						)
					),true
				);
				//������������뵽����������allOut��
				//��allOut����
				synchronized (allOut) {
//					allOut=Arrays.copyOf(allOut,allOut.length+1);
//					//��������������������һ��Ԫ����
//					allOut[allOut.length-1]=pw;
//					System.out.println("��ǰ����������"+allOut.length);
					allOut.add(pw);
					System.out.println(host+"��������");
					System.out.println("��ǰ����������"+allOut.size());
				}
				//��ȡ�ͻ��˷��͹�������Ϣ
				InputStream in=socket.getInputStream();
				BufferedReader br=new BufferedReader(
						new InputStreamReader(in, "utf-8"));
				String message=null;
				while((message=br.readLine())!=null){
					System.out.println(host+say[num]+"��"+message);
					//�ظ���ǰ�ͻ���
					//����allOut���飬��ÿ���ͻ��˷���һ��
					synchronized(allOut){
						message=Message(message);
						for(PrintWriter p:allOut){
							p.println(host+say[num]+":"+message);
						}	
					}
				}
			} catch (Exception e){
//				e.printStackTrace();
			}finally{
				//����ͻ��˶Ͽ����Ӻ�Ĳ���
				//1����ǰ�ͻ��˵��������allOut��ɾ��
				synchronized(allOut){
//					for(int i=0;i<allOut.length;i++){
//						if(pw==allOut[i]){
//							allOut[i]=allOut[allOut.length-1];
//							allOut=Arrays.copyOf(allOut, allOut.length-1);
//							break;
//						}
//					}
					allOut.remove(pw);
					System.out.println(host+":������");
					System.out.println("��ǰ����������"+allOut.size());
				}
				//2��socket�ر��ͷ���Դ
				try {
					socket.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		
		public String  Message(String line){
			String letters="(����ĥ|�����|��|nc|��)";
			line=line.replaceAll(letters,"***");
//			String arr[]={"����ɵ�ƣ�","�������","�������ʦ̫","����Ӵ",
//					"����������","��ʼ���Ǿܾ�ȥ�����е�"};
//			line=arr[(int)(Math.random()*arr.length)];
			return line;
		}
	}
}
