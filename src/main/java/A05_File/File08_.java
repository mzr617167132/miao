package A05_File;

import java.io.File;
/**
 * �ݹ�ɾ���ļ�
 * 1.�ݹ�����ܹ���������
 * 	  -���ܽ������޶ȵݹ飬�����ܹ�����
 *    -����ݹ���̫��
 * 2.�ݹ黯��Ϊ��Ľ�����⣬ֻ��Ҫ���ǵ�һ��
 */
public class File08_ {

	public static void main(String[] args) {
		File file=new File("D:/demo8");
		del(file);
		System.out.println("finish");
	}
	
	/**
	 * �ݹ�ɾ���ļ�
	 */
	public static void del(File file){
	/**
	 *������file������:
	 *1.������ļ��У�����ɾ���ļ��е�����Ȼ����ɾ���ļ���
	 *2.��������ļ�����ֱ��ɾ���ļ�
	 * 
	 */
		if(file.isDirectory()){
			//ɾ���ļ�������
			File[]files=file.listFiles();
			for(File f:files){
				//���õݹ鸴�õ�ǰ����
				del(f);
			}
		}
		System.out.println(file);
		file.delete();
	}
}
