package A11_List;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List接口
 * List继承自Collection，它是一个可重复集合，并且有序。
 * 提供了一组独有的方法，是可以通过下标操作元素的。
 * 
 * 常用实现类：
 * java.util.ArrayList:内部由数组实现，查询效率更好
 * java.util.LinkedList:内部由链表实现，增删效率好，尤其
 * 首尾增删效率最好。
 * 没有对性能极端苛刻要求下通常用ArrayList即可。
 * @author M.C.
 *
 */
public class Demo01_List {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("one");
		list.add("three");
		list.add("four");
		list.add("two");
		System.out.println(list);
		/*
		 * void add(int index,E e)
		 * 将给定元素插入到指定位置
		 * 
		 * [one,two,2,three,four]
		 */
		list.add(2,"2");
		System.out.println(list);
		/*
		 * 删除并返回指定位置对应的元素
		 */
		String old=list.remove(1);
		System.out.println(list);
		System.out.println("被删除元素是："+old);
		/*
		 * [one,2,3,four]
		 * E set(int index,E e)
		 * 用给定元素替换指定位置的元素，并将被替换元素返回。
		 */
		old=list.set(3, "3");
		System.out.println("被替换的元素是："+old);
		System.out.println(list);
		/*
		 * E get(int index)
		 * 获取指定下标位置对应的元素
		 */
		String str=list.get(3);
		System.out.println(str);
		for(int i=0;i<list.size();i++){
			str=list.get(i);
			System.out.println(str);
		}
	}
}
