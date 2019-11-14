package A15_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 方法含有参数的lambda
 * @author M.C.
 *
 */
public class Demo02_Lambda2 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("苍老师");
		list.add("小泽老师");
		list.add("传奇");
		Comparator<String> c=new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};
		
		/*
		 * 编译器会根据程序上下问分析出方法参数的类型，所以无需在lambda中指定参数类型
		 */
		Comparator<String> com=(o1,o2)->{
			return o1.length()-o2.length();
		};
		
		/*
		 * 若方法需要返回值，而方法只有一句代码时，在省略{}的同时return关键字也要省略
		 */
		com=(o1,o2)->o1.length()-o2.length();
		
		Collections.sort(list,com);
		System.out.println(list);
		
	}

}
