package A07_IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �����ַ�������
 * java.io.BufferedReader
 * ��ȡЧ�ʺã����ҿ��԰��ж�ȡ�ַ���
 * @author Administrator
 *
 */
public class Demo11_BufferedReader {

	public static void main(String[] args) throws IOException {
		/**
		 * ����ǰԴ�����ļ������ݰ��ж�ȡ���������������̨
		 */
		FileInputStream fis=new FileInputStream("pw.txt");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line=null;
		/**
		 * BufferedReader
		 * String readLine()
		 * �÷�����������ȡ�����ַ�������ȡ�����з�Ϊֹ����֮ǰ���е��ַ�
		 * ��һ���ַ�����ʽ���ء�ע�����ص��ַ����в������������Ļ��з���
		 * ������ֵΪnull����ʾ��ǰ����ȡ����ĩβ��������ͨ��������ȡ��
		 * �κ����ݣ�������ȡ�����ļ����ʾ�ļ���ȡ����ĩβ��
		 */
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}
