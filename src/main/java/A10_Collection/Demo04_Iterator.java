 package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection提供了一个通用的遍历集合元素的方式：
 * 迭代器模式
 * Iterator iterator（）
 * 该方法会返回一个遍历当前集合的迭代器
 * java.util.Iterator接口
 * 迭代器接口，规定了迭代器遍历集合的方式，不同的集合实现类都提供了
 * 一个用于遍历自身元素的迭代器实现类。我们无需记忆这些实现类的名字。只需要当他们是Itertor
 * 使用即可
 * 
 * 迭代器遍历集合遵循：问，取，删的遍历过程，其中删除元素不是遍历的必须操作。
 * @author M.C.
 *
 */
public class Demo04_Iterator {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
		//获取遍历该集合的迭代器
		Iterator<String> it=c.iterator();
		/*
		 * 迭代器常用方法：
		 * boolean hasNext()
		 * 判断是否还有下一个元素可以遍历
		 * 
		 * E next（）
		 * 获取下一个元素
		 * 注意：必须在hasNext（）为true的前提下才可以调用next方法
		 * 否则会抛出异常
		 */
		while(it.hasNext()){
			String o=(String)it.next();
			System.out.println(o);
			if("#".equals(o)){
				/*
				 * 迭代器要求在遍历的过程中不允许通过集合自身的方法增删元素
				 * c.remove(o)
				 */
				/*
				 * 迭代器提供的remove方法删除的是通过next方法得到的元素
				 */
				it.remove();
			}
		}
		System.out.println(c);
	}

}
