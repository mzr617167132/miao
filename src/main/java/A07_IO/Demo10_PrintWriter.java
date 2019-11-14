package A07_IO;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符输出流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 内部有缓冲区，读写字符效率好，并且特点是可以按行读写字符串
 * 
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符输出流，内部会连接BufferedWriter作为其加速的功能。
 * @author Administrator
 *
 */
public class Demo10_PrintWriter {

	public static void main(String[] args) throws IOException {
		/**
		 * PrintWriter提供了直接写文件的构造方法：
		 * PrintWriter（String fileName）
		 * Printwriter（File file）
		 * 兵器提供了用于按照指定字符集写文件的构造方法
		 * PrintWriter（String fileName，String csn）
		 * PrintWriter（File file，String csn）
		 * 注：csn是charset name，即：字符集名称
		 */
		PrintWriter pw=new PrintWriter("pw.txt","utf-8");
		pw.println("我是隔壁的泰山");
		pw.println("123456");
		System.out.println("finish");
		pw.close();
	}

}
