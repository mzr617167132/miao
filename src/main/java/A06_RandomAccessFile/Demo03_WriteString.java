package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * byte[]data=str.getBytes();
 * ���ļ���д���ַ���
 * 
 */
public class Demo03_WriteString {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
		String str="�ҿ��Խ���������У�����СƢ��.";
		byte []data=str.getBytes("UTF-8");
		raf.write(data);
		System.out.println("finish");
		raf.close();
	}
}
