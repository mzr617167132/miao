package A11_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 我们常用的集合实现类：
 * ArrayList,LinkedList,HashSet都不是线程安全的，在多线程
 * 情况下使用会存在问题
 * collections提供了方法可以将给定的集合转换为线程安全的
 * @author M.C.
 *
 */
public class Demo08_Sync {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("one");
		list.add("three");
		list.add("two");
		list.add("four");
		System.out.println(list);
		//将给定的List集合转换为线程安全的
		list=Collections.synchronizedList(list);
		System.out.println(list);
		
		
		Set<String>set=new HashSet<>(list);
		System.out.println(set);
		set=Collections.synchronizedSet(set);
		System.out.println(set);
	}

}
