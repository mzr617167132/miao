package A07_IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流链接中使用pw
 * @author Administrator
 *
 */
public class Demo10_PrintWriter02 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("pw2.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bw=new BufferedWriter(osw);
		PrintWriter pw=new PrintWriter(bw);
		pw.println("hello");
		pw.println("123456");
		System.out.println("finish");
		pw.close();
		
	}

}
