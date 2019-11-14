package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 集合框架
 * 集合与数组相似，用来保存一组元素，并提供了维护元素的一些操作，使用起来比数组方便，并且提供了各种
 * 数据结构的实现。
 * Collection是所有集合的顶级接口，其定义了所有集合都必须具备的功能。
 * 它由两个常见的子接口：
 * java.util.List:可重复集合，并且有序
 * java.util.Set:不可重复集合
 * 重复指的是元素是否允许重复，而重复的标准是依靠元素自身equals比较的结果而定。
 * @author M.C.
 *
 */
public class Demo01_Collection {
	
	public static void main(String[] args) {
		Collection c=new ArrayList();
		/*
		 * boolean add(E e)
		 * 向当前集合中添加给定元素，元素成功添加后返回true，否则返回false
		 */
		boolean a=c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(a);
		System.out.println(c);
		
		int size=c.size();
		System.out.println("集合大小："+size);
		
		boolean isEmpty=c.isEmpty();
		System.out.println("空集："+isEmpty);
		
		//清空集合
		c.clear();
		System.out.println("集合已清空");
		System.out.println("size:"+c.size());
		System.out.println("空集："+c.isEmpty());
		System.out.println(c);
		
	}

}
