package A07_IO;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * �����ַ������
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * �ڲ��л���������д�ַ�Ч�ʺã������ص��ǿ��԰��ж�д�ַ���
 * 
 * java.io.PrintWriter
 * �����Զ���ˢ�µĻ����ַ���������ڲ�������BufferedWriter��Ϊ����ٵĹ��ܡ�
 * @author Administrator
 *
 */
public class Demo10_PrintWriter {

	public static void main(String[] args) throws IOException {
		/**
		 * PrintWriter�ṩ��ֱ��д�ļ��Ĺ��췽����
		 * PrintWriter��String fileName��
		 * Printwriter��File file��
		 * �����ṩ�����ڰ���ָ���ַ���д�ļ��Ĺ��췽��
		 * PrintWriter��String fileName��String csn��
		 * PrintWriter��File file��String csn��
		 * ע��csn��charset name�������ַ�������
		 */
		PrintWriter pw=new PrintWriter("pw.txt","utf-8");
		pw.println("���Ǹ��ڵ�̩ɽ");
		pw.println("123456");
		System.out.println("finish");
		pw.close();
	}

}
