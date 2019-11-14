package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF��ר��������д�ļ����ݵ�API
 * �����ָ����Է���һ���ļ�������λ�ò����ж�д���ݲ�����
 * ʹ�������ļ����ݱ༭�Ƿǳ���
 * ����RAFʱ������ģʽ
 * ��r����ֻ��ģʽ��������д�������ļ������ڣ����׳��쳣
 * ��rw������дģʽ�����Զ��ļ����ݽ��ж���д����,����ļ������ڣ����Զ�����
 * RAF�ṩ�������췽��
 * RandomAccessFile(file f,String mode)
 * RandomAccessFile(String path,String mode)
 * 
 * ��ȡ���ļ����ʱ�򣬷��� -1 ��ʾ���ļ�ĩβ��
 *
 */
public class Demo01_Raf {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("D:/demo.dat", "rw");
		//��ȡraf��ǰ�ļ�ָ��λ��
//		raf.seek(raf.length());
		long p=raf.getFilePointer();
		System.out.println(p);
		raf.write(65);
		p=raf.getFilePointer();
		System.out.println(p);
		
		raf.seek(0);
		int b=raf.read();
		System.out.println(b);
		raf.close();
	}
}
