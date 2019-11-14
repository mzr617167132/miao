package A07_IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流写出数据时的缓冲区问题
 * @author Administrator
 *
 */
public class Demo05_BufferedOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("bos.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String str="回手，掏";
		byte[]data=str.getBytes("utf-8");
		bos.write(data);
		/**
		 * flush方法会强制将当前缓冲流中已经缓存的数据一次性写出
		 * 频繁的调用flush会降低写效率，但是可以保证数据写出的即时性
		 */
		bos.flush();
		System.out.println("finish");
		/**
		 * 缓冲流关闭时会自动调用一次flush方法
		 */
		bos.close();
		
		
	}

}
