package A05_File;

import java.io.File;
/**
 * boolean f=file.exists(); 
 * �жϵ�ǰFile��ʾ���ļ���Ŀ¼�Ƿ����
 * @author Administrator
 *
 */
public class File02_exists {

	public static void main(String[] args) {
		/**
		 * ����ļ����ļ��У��Ƿ����
		 */
		File file1=new File("D:/demo");
		File file2=new File("D:/demo2");
		/**
		 * File �ṩ��API���� exists��������ļ����ļ��У�
		 * �Ƿ��Ѿ����ڣ�����true����ڣ�false������
		 */
		boolean b1=file1.exists();
		boolean b2=file1.exists();
		System.out.println(b1+","+b2);
	
	
	
	}

}
