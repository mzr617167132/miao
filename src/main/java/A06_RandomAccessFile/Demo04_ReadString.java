package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 读取字符串
 * @author MC
 *
 */
public class Demo04_ReadString {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "r");
		
		//创建一个与文件一样长的字节
		byte[]data=new byte[(int)raf.length()];
		//一次性将文件所有字节读取出来
		raf.read(data);
		/**
		 * String提供了构造方法，可以将给定的字节数组中所有字节按照指定字符集
		 * 还原为字符串
		 */
		String str=new String(data,"UTF-8");
		System.out.println(str);
		raf.close();
		
		
	}

}
