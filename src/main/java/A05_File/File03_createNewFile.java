package A05_File;

import java.io.File;
import java.io.IOException;
/**
 * boolean f=file.createNewFile() 
 * ������ǰFile��ʾ���ļ�
 * 
 * �ļ��к��ļ���������:�������ļ��У��Ͳ����ٴ����ļ��ˡ�
 */
public class File03_createNewFile {

	public static void main(String[] args) throws IOException {
		/**
		 * ����File API�������ļ�
		 */
		File file1=new File("D:/text.txt");
		/**
		 * createNewFile()���ڴ����ϴ������ļ�
		 */
		boolean b=file1.createNewFile();
		System.out.println(b);
		/**
		 * ���ļ����д����ļ�/�ļ���
		 * new File�����ļ��У��ļ�����;
		 * ��ʾ�ļ����ļ�����
		 */
		File demo=new File("D:/demo");
		demo.mkdirs();
		File file3=new File(demo,"myfile.txt");
		file3.createNewFile();
		File file4=new File(demo,"test");
		file4.mkdir();
		
		
		
		
	}

}
