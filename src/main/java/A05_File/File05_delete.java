package A05_File;

import java.io.File;
/**
 * File f=file.delete();        
 * ����ǰ��ĿĿ¼�е�test.txt�ļ�ɾ��
 *
 * ֻ��ɾ���ļ��Ϳ��ļ���
 */
public class File05_delete {

	public static void main(String[] args) {
		/**
		 * ɾ���ļ�delete()
		 * ����boolean���͵�ֵ�����Ϊtrue��ʾɾ�����ļ�
		 * �������false����ɾ��ʧ��
		 * ����ļ��Ѿ��������ˣ��򷵻�false
		 * 
		 * ɾ�����Ǵ����ļ���ɾ�����ڴ�file�����ڣ�
		 * ��ȷ�������ļ��Ƿ��Ѿ�ɾ������������exists������⡣
		 */
		File file=new File("D:/abc");
		boolean b=file.delete();
		System.out.println(b);
		System.out.println(file.exists());
	}

}
