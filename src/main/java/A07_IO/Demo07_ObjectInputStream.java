package A07_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ����������
 * ��һ���ֽڰ�����ṹ��ԭΪ���ʾ�Ķ�����Ҫע�⣬
 * �������Ӧ����ͨ�������������һ������ת����һ���ֽڡ�
 * @author Administrator
 *
 */
public class Demo07_ObjectInputStream {

	public static void main(String[] args) throws IOException, Exception {
		FileInputStream fis=new FileInputStream("person.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		/**
		 * ������������ȡһ���ֽڲ�������ṹ��ԭΪjava�����������̳�Ϊ���������л�
		 */
		Person p=(Person)ois.readObject();
		System.out.println(p);
		ois.close();
	}

}
