package A11_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组工具类：Arrays提供了一个静态方法asList
 * 可以将当前数组转换为一个List集合
 * @author M.C.
 *
 */
public class Demo03_ArrayToList {
	public static void main(String[] args) {
		String []arr={"one","two","three","four"};
		System.out.println("arr:"+Arrays.toString(arr));
		List<String>list=Arrays.asList(arr);
		System.out.println(list);
		/*
		 * 对从数组转换的集合操作就是对原数组的操作
		 */
		list.set(1, "2");
		System.out.println(list);
		System.out.println(Arrays.toString(arr));
		/*
		 * 由于数组是定长的，所以会影响数组元素个数的操作都是不支持的
		 * 会抛异常
		 */
//		list.add("five");
//		System.out.println(list);
		
//		List<String>list2=new ArrayList<>(list);
//		list2.addAll(list);
		/*
		 * 所有的集合都支持一个参数为Collection的构造方法
		 * 作用是创建当前集合的同时包含给定集合中的所有元素
		 */
		List<String>list2=new ArrayList<>(list);
		list2.add("five");
		System.out.println(list2);
	}

}
