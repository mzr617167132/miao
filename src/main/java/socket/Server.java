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
 * 聊天室服务端
 * @author Administrator
 */
public class Server {
	/**
	 * java.net.ServerSocket
	 * 运行在服务端的ServerSocket主要有两个工作
	 * 1：向系统申请端口，客户端就是通过这个端口与服务端程序建立连接的
	 * 2：监听该端口，一旦一个客户端通过该端口请求连接时会自动返回一个
	 *   Socket实例，那么服务端就可以通过这个Socket与客户端进行交互了。
	 */
	private ServerSocket server;
	/**
	 * 由于内部类可以访问外部类的属性，所以所有ClientHandler都可以看到
	 * Server的这个属性，因此使用这个数组用于保存所有ClientHandler
	 * 对应客户端的输出流，以便他们之间广播各自客户端发送过来的消息给所有客户端。
	 */
//	private PrintWriter[] allOut={};
	private Collection<PrintWriter> allOut
		=new ArrayList<>();
	/**
	 * 构造方法，用来初始化服务端
	 */
	public Server(){
		try {
			System.out.println("正在启动服务端...");
			server=new ServerSocket(8088);
			System.out.println("服务端已启动！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 服务端启动方法
	 */
	public void start(){
		try {
			/**
			 * ServerSocket
			 * Socket accept()
			 * 是一个阻塞方法,调用还即处于阻塞状态，这时会等待客户端的连接，一旦一个
			 * 客户端通过Socket请求连接时，那么该方法会立即返回一个Socket实例
			 * 通过这个Socket即可与刚建立连接的客户端进行交互数据
			 * 多次调用该方法可以接受多个客户端的连接。
			 */
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket=server.accept();
				System.out.println("一个客户端连接了");
			//启动一个线程来处理与客户端交互
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
	 * 该线程负责与指定客户端交互
	 * @author Administrator
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		private String host;    //远端计算机地址信息
		public ClientHandler(Socket socket){
			this.socket=socket;
			InetAddress address=socket.getInetAddress();
			host=address.getHostAddress();
		}
		public void run() {
			System.out.println("启动了一个线程！");
			String say[]={"喊","说","叫"};
			int num=(int)(Math.random()*3);
			PrintWriter pw=null;
			try {
				//通过socket创建输出流，用于给客户端发消息
				pw=new PrintWriter(
					new BufferedWriter(
						new OutputStreamWriter(
							socket.getOutputStream(),"utf-8"
						)
					),true
				);
				//将该输出流存入到到共享数组allOut中
				//对allOut扩容
				synchronized (allOut) {
//					allOut=Arrays.copyOf(allOut,allOut.length+1);
//					//将该输出流存入数组最后一个元素上
//					allOut[allOut.length-1]=pw;
//					System.out.println("当前在线人数："+allOut.length);
					allOut.add(pw);
					System.out.println(host+"：上线了");
					System.out.println("当前在线人数："+allOut.size());
				}
				//读取客户端发送过来的消息
				InputStream in=socket.getInputStream();
				BufferedReader br=new BufferedReader(
						new InputStreamReader(in, "utf-8"));
				String message=null;
				while((message=br.readLine())!=null){
					System.out.println(host+say[num]+"："+message);
					//回复当前客户端
					//遍历allOut数组，给每个客户端发送一遍
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
				//处理客户端断开连接后的操作
				//1将当前客户端的输出流从allOut中删除
				synchronized(allOut){
//					for(int i=0;i<allOut.length;i++){
//						if(pw==allOut[i]){
//							allOut[i]=allOut[allOut.length-1];
//							allOut=Arrays.copyOf(allOut, allOut.length-1);
//							break;
//						}
//					}
					allOut.remove(pw);
					System.out.println(host+":下线了");
					System.out.println("当前在线人数："+allOut.size());
				}
				//2将socket关闭释放资源
				try {
					socket.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		
		public String  Message(String line){
			String letters="(超耐磨|他妈的|表|nc|妈)";
			line=line.replaceAll(letters,"***");
//			String arr[]={"我是傻逼！","我想出家","吾乃灭绝师太","好嗨哟",
//					"我是渣渣辉","开始我是拒绝去当和尚的"};
//			line=arr[(int)(Math.random()*arr.length)];
			return line;
		}
	}
}
