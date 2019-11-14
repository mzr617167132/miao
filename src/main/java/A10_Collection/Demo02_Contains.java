package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(Object o)
 * 判断当前集合是否包含给定元素
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
		 * contains判断是否包含元素是用给定元素与集合元素顺序equals比较，
		 * 有相同的就认为包含
		 */
		boolean contains=c.contains(p);
		System.out.println("包含："+contains);
	}
}
