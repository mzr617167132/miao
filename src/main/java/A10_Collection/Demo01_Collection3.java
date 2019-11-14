package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���ϲ���
 * @author M.C.
 *
 */
public class Demo01_Collection3 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("java");
		c1.add("c++");
		c1.add("c");
		System.out.println(c1);
		Collection c2=new HashSet();
		c2.add("c#");
		c2.add("php");
		c2.add("java");
		System.out.println(c2);
		/*
		 * boolean addAll(Collection c)
		 * �����������е�����Ԫ����ӵ���ǰ�����У�����Set���϶���
		 * �ظ�Ԫ�ز����ᱻ����
		 */
		c1.addAll(c2);
		System.out.println(c1);
		
		Collection c3=new ArrayList();
		c3.add("php");
		c3.add("c++");
		c3.add("android");
		System.out.println(c3);
		/*
		 * boolean containsAll(Collection c)
		 * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
		 */
		boolean contains=c1.containsAll(c3);
		System.out.println("c1����c3����Ԫ�أ�"+contains);
		/*
		 * boolean removeAll(Collection c)
		 * ɾ����
		 */
		c1.removeAll(c3);
		System.out.println(c1);
	}

}
