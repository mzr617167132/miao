package A05_File;

import java.io.File;
/**
 * Flie���ļ�ϵͳ�е�һ���ļ���Ŀ¼
 * 1.�������ʾ���ļ���Ŀ¼��������Ϣ
 * 2.������ɾ���ļ���Ŀ¼
 * 3.����һ��Ŀ¼�е���������
 * ���ǲ���ʹ��File�����ļ�����.
 * @author Administrator
 * 
 * ����Ŀ¼
 * boolean b=dir.mkdir();
 * 
 * ��������Ŀ¼a/b/c
 * boolean b=dir.mkdirs();        
 *
 */
public class File01_mkdir {

	public static void main(String[] args) {
		/**
		 * File API
		 * 1.����ʹ�þ���·���������·��
		 * 2.·���ָ���
		 *    -Windows ϵͳ��"\"
		 *    -java API�л��Զ��Ľ�/����Ϊ\\
		 *    -Linux\Unix\Mac ϵͳ��"/"
		 *    \��Ϊ��б�ߣ�/��Ϊб��
		 */
		//new File ֻ�ǳ����ڴ���󣬲��ᴴ���ļ���
		//����mkdir����ʱ��Ŵ����ļ���
		File file=new File("D:/demo");
		//Linux ϵͳ��ʹ�ã�
		//File file = new File("/home/soft01/demo");
		
		//mkdir�����������ڴ����ļ���
		//����ֵΪtrue����ʾ�����ɹ�������Ϊʧ��
		boolean b=file.mkdir();
		
		File a=new File("D:/a/b/c/d/e");
		a.mkdirs();

	}

}
