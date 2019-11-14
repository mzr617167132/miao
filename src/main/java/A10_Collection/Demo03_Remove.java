package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除元素
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
		 * remove方法也是依靠元素equals比较的结果进行删除的
		 * 若List集合中有重复元素时删除第一个比较为true
		 */
		
		c.remove(p);
		System.out.println(c);
	}

}
