package A07_IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流
 * java.io.BufferedReader
 * 读取效率好，并且可以按行读取字符串
 * @author Administrator
 *
 */
public class Demo11_BufferedReader {

	public static void main(String[] args) throws IOException {
		/**
		 * 将当前源代码文件中内容按行读取出来并输出到控制台
		 */
		FileInputStream fis=new FileInputStream("pw.txt");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line=null;
		/**
		 * BufferedReader
		 * String readLine()
		 * 该方法会连续读取若干字符，当读取到换行符为止，将之前所有的字符
		 * 以一个字符串形式返回。注：返回的字符串中不含有这行最后的换行符。
		 * 若返回值为null，表示当前流读取到了末尾（不能再通过该流读取到
		 * 任何内容）。若读取的是文件则表示文件读取到了末尾。
		 */
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}
