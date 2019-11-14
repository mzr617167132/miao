package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
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
		 * 将给定集合中的所有元素添加到当前集合中，对于Set集合而言
		 * 重复元素并不会被加入
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
		 * 判断当前集合是否包含给定集合中的所有元素
		 */
		boolean contains=c1.containsAll(c3);
		System.out.println("c1包含c3所有元素："+contains);
		/*
		 * boolean removeAll(Collection c)
		 * 删交集
		 */
		c1.removeAll(c3);
		System.out.println(c1);
	}

}
