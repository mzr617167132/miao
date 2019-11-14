package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * �����ҿͻ���
 *
 *
 */
public class Client {
	/**
	 * java.net.Socket  �׽���
	 * Socket��װ��TCPЭ��ͨѶ��ϸ�ڣ����ṩ��������
	 * ����������˵����ݽ���������
	 */
	private Socket socket;
	/**
	 * ���췽�������ڳ�ʼ���ͻ���
	 */
	public Client(){
		try {
			/*
			 *ʵ����Socketʱ�������ӷ���˵Ĺ���
			 *������Ҫ������������
			 *1������˵�IP��ַ��ͨ���������ҵ��������ϵķ���˼����
			 *2���˿ںţ�ͨ�����Ϳ������ӵ������ڷ���˼�����ϵķ����Ӧ�ó����ˡ�
			 *�����ǿͻ��˵�IP��ַ�Ͷ˿ں�ϵͳ��������ʱ���͸�����ˡ��������ǵ�
			 *�˿���ϵͳָ���ġ� 
			 */
			System.out.println("�������ӷ����....");
			socket=new Socket("176.130.24.27",8088);
			System.out.println("�����˽������ӣ�");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start(){
		
		try {
			//������ȡ����˷��͹�����Ϣ���߳�
			ServerHandler handler=new ServerHandler();
			Thread t=new Thread(handler);
			t.start();
			
			Scanner sc=new Scanner(System.in);
			/*
			 * SocketStream getOutputStream()
			 * �÷������Ի�ȡһ���ֽ��������ͨ�������д�����ֽڻ�ͨ��
			 * ���緢�͸�Զ�˼����
			 */
			OutputStream out=socket.getOutputStream();
			PrintWriter pw=new PrintWriter(
				new BufferedWriter(
					new OutputStreamWriter(out,"utf-8")
				),true                         //���Զ���ˢ��
			);
			while(true){
				String line=sc.nextLine();
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client=new Client();
		client.start();
	}
	private class ServerHandler implements Runnable{

		@Override
		public void run() {
			try {
				/**
				 * ͨ��socket��ȡ����������ȡ����˷��͹�������Ϣ
				 */
				BufferedReader br=new BufferedReader(
					new InputStreamReader(
						socket.getInputStream(), "utf-8"
					)
				);
				String line=null;
				while((line=br.readLine())!=null){
					//��ȡ����˷��͹�����һ���ַ���
					System.out.println(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
