package A07_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03_Copy {

	public static void main(String[] args) throws IOException {
		/**
		 * 实现过程：
		 * 1：创建文件输入流读取原文件
		 * 2：创建文件输出流用于向复制文件写操作
		 * 3：循环通过文件输入流从原文件读取字节后将其通过文件
		 *   输出流写入到复制文件中
		 * 4：若原文件读取到末尾了，则复制结束
		 */
		FileInputStream fis=new FileInputStream("fos.txt");
		FileOutputStream fos=new FileOutputStream("fos_cp.txt");
		byte[]data=new byte[1024*10];
		int len=-1;
		while((len=fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("复制成功");
		fis.close();
		fos.close();
		
	}

}
