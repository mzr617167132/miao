package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��д������������
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
		 * ����д��4�ֽڣ���intֵд��
		 */
		raf.writeInt(imax);
		raf.writeLong(123L);
		raf.writeDouble(12.123);
		System.out.println("pos:"+raf.getFilePointer());
		int pos=raf.read();
		System.out.println(pos);
		System.out.println("finish");
		
		//��ȡint
		raf.seek(0);//�ƶ�ָ�뵽�ļ���ʼ
		int d=raf.readInt();
		System.out.println(d);
		//��ȡlong
		raf.seek(8);
		long l=raf.readLong();
		System.out.println(l);
		
		
		raf.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
