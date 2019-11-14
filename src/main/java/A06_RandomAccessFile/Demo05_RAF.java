package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写基本类型数据
 */
public class Demo05_RAF {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.dat", "rw");
		/*                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 * imax>>>24
		 * 00000000 00000000 00000000 01111111
		 * 
		 */
		int imax=Integer.MAX_VALUE;
		raf.write(imax>>>24);
		raf.write(imax>>>16);
		raf.write(imax>>>8);
		raf.write(imax);
		/**
		 * void writeInt(imax);
		 * 连续写出4字节，将int值写出
		 */
		raf.writeInt(imax);
		raf.writeLong(123L);
		raf.writeDouble(12.123);
		System.out.println("pos:"+raf.getFilePointer());
		int pos=raf.read();
		System.out.println(pos);
		System.out.println("finish");
		
		//读取int
		raf.seek(0);//移动指针到文件开始
		int d=raf.readInt();
		System.out.println(d);
		//读取long
		raf.seek(8);
		long l=raf.readLong();
		System.out.println(l);
		
		
		raf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
