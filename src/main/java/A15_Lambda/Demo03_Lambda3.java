package A15_Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * JDk8之后，集合为lambda提供了新的遍历的方式：foreach方法
 * @author M.C.
 *
 */
public class Demo03_Lambda3 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("苍老师");
		list.add("小泽老师");
		list.add("传奇");
		/*
		 * API 手册明确说明，一个并发安全的集合，它的元素操作（add，remove）
		 * 也不与迭代器遍历操作互斥，这意味着多线程并发操作该集合时，如果遍历与增删
		 * 元素同时执行仍然存在并发安全问题。
		 * 但是JDK8之后的foreach方法遍历是没有问题的，因为该方法是用集合自身的方法
		 * 遍历自然可以喝自身的add，remove等方法互斥
		 */
		for(String str:list){
			System.out.println(str);
		}
		//若该集合是并发安全的，那么foreach也是并发安全的
		list.forEach((e)->System.out.println(e));
	}

}
