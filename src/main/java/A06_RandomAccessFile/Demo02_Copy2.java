package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次读写的数据量，减少实际读写的次数，可以提高读写效率。
 * 单字节读写：随机读写形式
 * 一组字节读写：块读写形式
 * @author Administrator
 *
 */
public class Demo02_Copy2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src=new RandomAccessFile("aa.zip", "r");
		RandomAccessFile desc=new RandomAccessFile("aa_cp.zip", "rw");
		
		/**
		 * int read（byte[]data）
		 * 一次性从文件中读取指定字节数组总长度的字节量
		 * 并将读取的字节顺序存入到该数组中
		 * 返回值为实际读取到的字节量，若返回值为-1，则
		 * 表示本次没有读取任何字节（文件末尾）
		 * 
		 * void write(byte[] data)
		 * 一次性将给定的字节数组中所有字节写出
		 * 
		 * void write(byte[]data,int start,int len)
		 * 一次性将给定的字节数组中从下标start出开始的连续len个字节一次性写出。
		 */
		
		//实际读取到的字节量
		int len=-1;
		/**
		 * 10kb
		 */
		byte[]data=new byte[1024*10];
		while((len=src.read(data))!=-1){
			System.out.println(len);
			desc.write(data,0,len);
		}
		System.out.println("finish");
		src.close();
		desc.close();
		
		
		
	}

}
