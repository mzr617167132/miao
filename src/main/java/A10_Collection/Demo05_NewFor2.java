package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环遍历集合
 * @author M.C.
 *
 */
public class Demo05_NewFor2 {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		/*
		 * 新循环遍历集合会被编译器改为迭代器遍历，所以不要在新循环遍历过程
		 * 中通过集合的方法增删元素
		 */
		for(String str:c){
			System.out.println(str);
		}
	}

}
