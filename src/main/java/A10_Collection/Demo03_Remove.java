package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ɾ��Ԫ��
 * @author M.C.
 *
 */
public class Demo03_Remove {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Point(1, 2));
		c.add(new Point(3, 4));
		c.add(new Point(5, 6));
		c.add(new Point(1, 2));
		System.out.println(c);
		Point p=new Point(1, 2);
		/*
		 * remove����Ҳ������Ԫ��equals�ȽϵĽ������ɾ����
		 * ��List���������ظ�Ԫ��ʱɾ����һ���Ƚ�Ϊtrue
		 */
		
		c.remove(p);
		System.out.println(c);
	}

}
