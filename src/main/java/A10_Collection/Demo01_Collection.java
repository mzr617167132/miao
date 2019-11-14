package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * ���Ͽ��
 * �������������ƣ���������һ��Ԫ�أ����ṩ��ά��Ԫ�ص�һЩ������ʹ�����������鷽�㣬�����ṩ�˸���
 * ���ݽṹ��ʵ�֡�
 * Collection�����м��ϵĶ����ӿڣ��䶨�������м��϶�����߱��Ĺ��ܡ�
 * ���������������ӽӿڣ�
 * java.util.List:���ظ����ϣ���������
 * java.util.Set:�����ظ�����
 * �ظ�ָ����Ԫ���Ƿ������ظ������ظ��ı�׼������Ԫ������equals�ȽϵĽ��������
 * @author M.C.
 *
 */
public class Demo01_Collection {
	
	public static void main(String[] args) {
		Collection c=new ArrayList();
		/*
		 * boolean add(E e)
		 * ��ǰ��������Ӹ���Ԫ�أ�Ԫ�سɹ���Ӻ󷵻�true�����򷵻�false
		 */
		boolean a=c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(a);
		System.out.println(c);
		
		int size=c.size();
		System.out.println("���ϴ�С��"+size);
		
		boolean isEmpty=c.isEmpty();
		System.out.println("�ռ���"+isEmpty);
		
		//��ռ���
		c.clear();
		System.out.println("���������");
		System.out.println("size:"+c.size());
		System.out.println("�ռ���"+c.isEmpty());
		System.out.println(c);
		
	}

}
