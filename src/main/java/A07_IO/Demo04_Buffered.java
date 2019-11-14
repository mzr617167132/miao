package A07_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲流
 * 缓冲流是一对高级流，作用是加快读写效率。在流链接中串联它们以后，
 * 无论我们对数据如何读写，最终都会被缓冲流转化为块读写来提高效率。
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 
 *
 */
public class Demo04_Buffered {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis=new FileInputStream("bee0.png");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("bee0_cp.png");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int d=-1;
		while((d=bis.read())!=-1){
			bos.write(d);
		}
		System.out.println("finish");
		bis.close();
		bos.close();
		
	}

}
