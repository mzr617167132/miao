package A05_File;

import java.io.File;

/**
 * dir.listFiles()      
 * ���ص�ǰĿ¼�е��������ÿ���������fileʵ����ʽ��ʾ
 * 
 * �г��ļ��е�����
 * 1.�������ļ����ϵ��ô˷�����������ļ��ϵ���
 *   �˷����򷵻ؿ�ֵnull`
 * 2.����ֵ���ļ������ݣ�Ҳ�����ļ����е��ļ������ļ��С�
 *   ����ֵ������File[]����  
 *
 */
public class File06_ListFiles {
	public static void main(String[] args) {
		File dir=new File("D:/demo8");
		File[]files=dir.listFiles();
//		for(int i=0;i<files.length;i++){
//			File file=files[i];
//			System.out.println(file);
//		}
		for(File file:files){
			System.out.println(file);
		}
		
		
	}
}
