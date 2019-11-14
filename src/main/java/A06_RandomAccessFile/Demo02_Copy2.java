package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ���ÿ�ζ�д��������������ʵ�ʶ�д�Ĵ�����������߶�дЧ�ʡ�
 * ���ֽڶ�д�������д��ʽ
 * һ���ֽڶ�д�����д��ʽ
 * @author Administrator
 *
 */
public class Demo02_Copy2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile src=new RandomAccessFile("aa.zip", "r");
		RandomAccessFile desc=new RandomAccessFile("aa_cp.zip", "rw");
		
		/**
		 * int read��byte[]data��
		 * һ���Դ��ļ��ж�ȡָ���ֽ������ܳ��ȵ��ֽ���
		 * ������ȡ���ֽ�˳����뵽��������
		 * ����ֵΪʵ�ʶ�ȡ�����ֽ�����������ֵΪ-1����
		 * ��ʾ����û�ж�ȡ�κ��ֽڣ��ļ�ĩβ��
		 * 
		 * void write(byte[] data)
		 * һ���Խ��������ֽ������������ֽ�д��
		 * 
		 * void write(byte[]data,int start,int len)
		 * һ���Խ��������ֽ������д��±�start����ʼ������len���ֽ�һ����д����
		 */
		
		//ʵ�ʶ�ȡ�����ֽ���
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
