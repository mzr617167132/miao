package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * ��ȡ�ַ���
 * @author MC
 *
 */
public class Demo04_ReadString {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("raf.txt", "r");
		
		//����һ�����ļ�һ�������ֽ�
		byte[]data=new byte[(int)raf.length()];
		//һ���Խ��ļ������ֽڶ�ȡ����
		raf.read(data);
		/**
		 * String�ṩ�˹��췽�������Խ��������ֽ������������ֽڰ���ָ���ַ���
		 * ��ԭΪ�ַ���
		 */
		String str=new String(data,"UTF-8");
		System.out.println(str);
		raf.close();
		
		
	}

}
