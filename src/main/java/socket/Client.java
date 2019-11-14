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
 * 聊天室客户端
 *
 *
 */
public class Client {
	/**
	 * java.net.Socket  套接字
	 * Socket封装了TCP协议通讯的细节，其提供了两条流
	 * 来完成与服务端的数据交互工作。
	 */
	private Socket socket;
	/**
	 * 构造方法，用于初始化客户端
	 */
	public Client(){
		try {
			/*
			 *实例化Socket时就是连接服务端的过程
			 *这里需要传入两个参数
			 *1：服务端的IP地址，通过他可以找到互联网上的服务端计算机
			 *2：端口号，通过他就可以连接到运行在服务端计算机上的服务端应用程序了。
			 *而我们客户端的IP地址和端口号系统会在连接时发送给服务端。并且我们的
			 *端口是系统指定的。 
			 */
			System.out.println("正在连接服务端....");
			socket=new Socket("176.130.24.27",8088);
			System.out.println("与服务端建立连接！");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 客户端开始工作的方法
	 */
	public void start(){
		
		try {
			//启动读取服务端发送过来消息的线程
			ServerHandler handler=new ServerHandler();
			Thread t=new Thread(handler);
			t.start();
			
			Scanner sc=new Scanner(System.in);
			/*
			 * SocketStream getOutputStream()
			 * 该方法可以获取一个字节输出流，通过这个流写出的字节会通过
			 * 网络发送给远端计算机
			 */
			OutputStream out=socket.getOutputStream();
			PrintWriter pw=new PrintWriter(
				new BufferedWriter(
					new OutputStreamWriter(out,"utf-8")
				),true                         //打开自动行刷新
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
				 * 通过socket获取输入流，读取服务端发送过来的消息
				 */
				BufferedReader br=new BufferedReader(
					new InputStreamReader(
						socket.getInputStream(), "utf-8"
					)
				);
				String line=null;
				while((line=br.readLine())!=null){
					//读取服务端发送过来的一行字符串
					System.out.println(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
