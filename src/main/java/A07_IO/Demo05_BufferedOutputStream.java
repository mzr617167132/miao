package A07_IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���������д������ʱ�Ļ���������
 * @author Administrator
 *
 */
public class Demo05_BufferedOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("bos.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String str="���֣���";
		byte[]data=str.getBytes("utf-8");
		bos.write(data);
		/**
		 * flush������ǿ�ƽ���ǰ���������Ѿ����������һ����д��
		 * Ƶ���ĵ���flush�ή��дЧ�ʣ����ǿ��Ա�֤����д���ļ�ʱ��
		 */
		bos.flush();
		System.out.println("finish");
		/**
		 * �������ر�ʱ���Զ�����һ��flush����
		 */
		bos.close();
		
		
	}

}
