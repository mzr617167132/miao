package A05_File;

import java.io.File;
import java.io.FileFilter;
/**
 * ������Ŀ¼�Ľ��
 */
public class File07_FileFilter {

	public static void main(String[] args) {
		
		//�ļ�������������������������
//		FileFilter filter=new FileFilter() {
//			//accept ���ܣ����������ù���ʱ��Ľ�������
//			public boolean accept(File file) {
//				String name=file.getName();
//				return name.endsWith(".txt");
//			}
//		};
		
		FileFilter filter=(File file)->file.getName().endsWith(".txt");;
		File file=new File("D:/java");
		File[]files=file.listFiles(filter);
		for(File f:files){
			System.out.println(f);
		}
	}
}
