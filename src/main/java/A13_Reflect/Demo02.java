package A13_Reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ���÷���API��̬�����࣬���Ҷ�̬��������
 * @author M.C.
 *
 */
public class Demo02 {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		String className=sc.nextLine();
		/*
		 * ��̬�����ࣺ���سɹ�����Class���͵����ã���������Ժ�
		 * �洢�ڷ������е�����Ϣ�����������Ӧ�಻���ڣ����׳�û���ҵ����쳣
		 */
		Class cls=Class.forName(className);
		System.out.println("�ࣺ"+cls);
		/*
		 * newInstance()��̬�������󣬶�Ӧ���ͱ�������޲���
		 * �ɼ��������������׳��쳣��
		 */
		Object obj=cls.newInstance();
		System.out.println(obj);
		
		String name=sc.nextLine();
		/*
		 * getDeclaredMethod��ȡcls�����������ķ�����Ϣ���������������ȷ���׳��쳣
		 */
		Method method=cls.getDeclaredMethod(name);
		//�򿪷���Ȩ��
		method.setAccessible(true);
		//ִ�У�����invoke������
		Object val=method.invoke(obj);
		System.out.println(val);
	}
}
