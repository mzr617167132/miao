package A07_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * java.io.Reader,java.io.Writer
 * �����������ַ����ĳ��࣬�����������ַ���������߱��Ķ�д�ַ�����
 * 
 * java�������ն�д��λ�������ֽ������ַ���
 * �ַ����Ķ�д��λΪ�ַ������ǵײ���Ȼ�����ֽ�Ϊ��λ��д��
 * ���������ǲ����ַ���ʱ�����������ַ�Ϊ��С��λ��д��
 * ���ַ������Զ����ַ����ֽڽ���ת���������ַ���Ҳ���ʺ϶�д���ı����ݡ�
 * 
 * ת������
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * ����ʱ�ǳ����õ�һ���ַ���ʵ���࣬������һ�Ը߼�����
 * ʵ�ʿ����У����Ǽ�������ֱ�Ӳ������ǣ�������ʹ���ַ�����������ʱ������
 * �ǳ���Ҫ��һ����
 *
 *����֮���Գ�Ϊת����ԭ�����ڣ�java���������ַ���ͨ����ֻ�����������ַ���
 *������ʵ��Ӧ���еĴ󲿷ֵͼ��������ֽ�������ᵼ����Щ�߼����ַ�������ֱ��
 *�������ֽ����ϣ��Դ����ǵĽ��������������֮������ת��������Ϊת����������
 *һ���ַ������������ֿ����������ֽ����ϣ�������������������������þ��ǡ�ת��������Ч��
 */
public class Demo08_OutputStreamWriter {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("osw.txt");
		/**
		 * ���췽����OutputStreamWriter��OutputStream out��
		 * ������ǰת���������ӵ�ָ�����ֽ��������
		 * 
		 * OutputStreamWriter��OutputStream out ��String csn��
		 * ����ͬʱ����ָ���ַ���������ͨ����ǰ��д�����ı�
		 * ���ݶ��ᰴ�ո������ַ���ת��Ϊ�ֽں�д��
		 */
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		osw.write("�����Ը�������gai");
		System.out.println("д�����");
		osw.close();
	}

}
