package A07_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * ��������һ�Ը߼����������Ǽӿ��дЧ�ʡ����������д��������Ժ�
 * �������Ƕ�������ζ�д�����ն��ᱻ������ת��Ϊ���д�����Ч�ʡ�
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 
 *
 */
public class Demo04_Buffered {

	public static void main(String[] args) throws IOException  {
		FileInputStream fis=new FileInputStream("bee0.png");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("bee0_cp.png");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int d=-1;
		while((d=bis.read())!=-1){
			bos.write(d);
		}
		System.out.println("finish");
		bis.close();
		bos.close();
		
	}

}
