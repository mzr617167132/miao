package A07_IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件输入流
 * 用于读取文件数据的流
 * @author Administrator
 *
 */
public class Demo02_FileInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fos.txt");
		byte[]data=new byte[200];
		int len=fis.read(data);
		System.out.println(len);
		String line=new String(data,0,len,"utf-8");
		System.out.println(line);
		fis.close();
	}
}
