package A07_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * ��������һ�Ը߼�����ʹ�����ǿ������ɵĽ��κ�java������ж�д
 * @author Administrator
 *
 */
public class Demo06_ObjectOutputStream {

	public static void main(String[] args) throws IOException {
		/**
		 * ��һ��Personʵ��д�뵽�ļ�person.obj���κ�������д���ļ�
		 * ��Ҫ��ת��Ϊ2���ƣ�����һ��java����ת��Ϊһ��2���ƿ���ʹ�ö���
		 * ���������ɡ�
		 */
		String name="����ʦ";
		int age=18;
		String gender="Ů";
		String[]otherInfo={"��һ����Ա","������дë����"};
		Person p=new Person(name,age,gender,otherInfo);
		System.out.println(p);
		//�����ֽ�д���ļ�
		FileOutputStream fos=new FileOutputStream("person.obj");
		//���𽫶���ת��Ϊ�ֽ�
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		/**
		 * ��������д���󷽷����Ƚ������Ķ�������ṹת��Ϊһ���ֽں����ݽ��������ӵ�������
		 * ������������ֱ�����ӵ����ļ�������������ֱ�ӱ�д�����ļ���
		 * 
		 * ����Ҫд���Ķ�����һ��Ҫ���������������ʵ�ֽӿڣ�java.io.Serializable
		 * ����д��ʱ���׳��쳣��NotSerializableException
		 */
		/**
		 * ���ｫһ������д���ļ���������������
		 * 1�����󾭹����������д��ʱ��������������Ƚ��ö���������ת��Ϊһ���ֽڣ����
		 * ���̳�Ϊ�������л�
		 * 
		 * 2�����л�����ֽ��������ļ��������д���ļ���Ӳ���У������ñ��档������д��Ӳ�̵Ĺ��̳�Ϊ
		 * ���ݳ־û���
		 */
		oos.writeObject(p);
		System.out.println("finish");
		oos.close();
	}

}
