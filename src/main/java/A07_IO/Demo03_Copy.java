package A07_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03_Copy {

	public static void main(String[] args) throws IOException {
		/**
		 * ʵ�ֹ��̣�
		 * 1�������ļ���������ȡԭ�ļ�
		 * 2�������ļ���������������ļ�д����
		 * 3��ѭ��ͨ���ļ���������ԭ�ļ���ȡ�ֽں���ͨ���ļ�
		 *   �����д�뵽�����ļ���
		 * 4����ԭ�ļ���ȡ��ĩβ�ˣ����ƽ���
		 */
		FileInputStream fis=new FileInputStream("fos.txt");
		FileOutputStream fos=new FileOutputStream("fos_cp.txt");
		byte[]data=new byte[1024*10];
		int len=-1;
		while((len=fis.read(data))!=-1){
			fos.write(data,0,len);
		}
		System.out.println("���Ƴɹ�");
		fis.close();
		fos.close();
		
	}

}
