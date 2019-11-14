package A11_List;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue接口
 * 队列
 * 队列可以保存一组元素，但是存取元素必须遵循先进先出原则
 * Queue接口继承自Collection，所以也是一种集合
 * 常用实现类：LinkedList
 * @author M.C.
 *
 */
public class Demo05_Queue {

	public static void main(String[] args) {
		Queue<String>queue=new LinkedList<>();
		/*
		 * 入队操作，将给定元素添加到队列末尾
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * 出队操作，将队首元素从列表中移出
		 */
		String str=queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/*
		 * 引用队首元素，获取后队首元素仍然在队列中
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		//遍历队列
		for(String s:queue){
			System.out.println(s);
		}
		
		System.out.println("------");
		for(;queue.size()>0;){
			System.out.println(queue.poll());
		}
		System.out.println(queue);
		
		
	}

}
