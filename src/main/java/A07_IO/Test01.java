package A07_IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 
 * 程序启动后，要求用户输入一个文件名，然后对该文件写操作之后
 * 用户输入的每行字符串都按行写入到该文件中。
 * 当用户输入“exit”时程序退出。
 * 要求：使用PrintWriter完成按行写操作，创建时要求自行完成流链接操作。
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个文件名");
		String name=sc.nextLine().trim();
		FileOutputStream fos=new FileOutputStream(name+".txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bw=new BufferedWriter(osw);
		/**
		 * 在流链接中创建pw时可以传入第二个参数，该参数为一个boolean值，
		 * 若值为true，则当前pw具有自动行刷新功能
		 * 每当我们调用println方法后会自动flush。注意，print方法调用后不会flush
		 */
		PrintWriter pw=new PrintWriter(bw,true);
		System.out.println("请输入文字,按“exit”退出");
		while(true){
			String letter=sc.nextLine();
			if("exit".equals(letter)){
				break;
			}
			pw.println(letter);
		}
		System.out.println("你已经退出");
		pw.close();
	}

}
