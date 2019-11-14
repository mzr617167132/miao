package A07_IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ���׼��±�����
 * 
 * ����������Ҫ���û�����һ���ļ�����Ȼ��Ը��ļ�д����֮��
 * �û������ÿ���ַ���������д�뵽���ļ��С�
 * ���û����롰exit��ʱ�����˳���
 * Ҫ��ʹ��PrintWriter��ɰ���д����������ʱҪ��������������Ӳ�����
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ļ���");
		String name=sc.nextLine().trim();
		FileOutputStream fos=new FileOutputStream(name+".txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos, "utf-8");
		BufferedWriter bw=new BufferedWriter(osw);
		/**
		 * ���������д���pwʱ���Դ���ڶ����������ò���Ϊһ��booleanֵ��
		 * ��ֵΪtrue����ǰpw�����Զ���ˢ�¹���
		 * ÿ�����ǵ���println��������Զ�flush��ע�⣬print�������ú󲻻�flush
		 */
		PrintWriter pw=new PrintWriter(bw,true);
		System.out.println("����������,����exit���˳�");
		while(true){
			String letter=sc.nextLine();
			if("exit".equals(letter)){
				break;
			}
			pw.println(letter);
		}
		System.out.println("���Ѿ��˳�");
		pw.close();
	}

}
