package A05_File;

import java.io.File;
import java.io.IOException;

/**
 * File �ṩ�˷��������file�������ļ������ļ���
 * 1.��������ڣ�isFile������isDirectory����
 *   ������false
 * 2.������ڣ�
 *   1.��������Ŀ�����ļ�����isDirectory����
 *     ����true��isFile��������false
 *   2.��������Ŀ�����ļ���isDirectory����
 *     ����false��isFile��������true  
 * 
 * �жϵ�ǰFile�Ƿ�Ϊһ���ļ�
 * boolean b=file.isFile();
 * �жϵ�ǰFile�Ƿ�Ϊһ��Ŀ¼     
 * boolean b=file.isDirectoty();
 */
public class File04_isFileAndisDirectory {

	public static void main(String[] args) throws IOException {
		File file=new File("D:/abc");
		
		file.createNewFile();
//		file.mkdir();
		
		boolean b1=file.isFile();
		boolean b2=file.isDirectory();
		System.out.println(b1+","+b2);
		
	}

}
