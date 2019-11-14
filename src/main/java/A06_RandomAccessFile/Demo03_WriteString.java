package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * byte[]data=str.getBytes();
 * 向文件中写入字符串
 * 
 */
public class Demo03_WriteString {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
		String str="我可以接受你的所有，所有小脾气.";
		byte []data=str.getBytes("UTF-8");
		raf.write(data);
		System.out.println("finish");
		raf.close();
	}
}
