package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(Object o)
 * �жϵ�ǰ�����Ƿ��������Ԫ��
 * @author M.C.
 *
 */
public class Demo02_Contains {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		System.out.println(c);
		Point p=new Point(2, 2);
		/**
		 * contains�ж��Ƿ����Ԫ�����ø���Ԫ���뼯��Ԫ��˳��equals�Ƚϣ�
		 * ����ͬ�ľ���Ϊ����
		 */
		boolean contains=c.contains(p);
		System.out.println("������"+contains);
	}
}
