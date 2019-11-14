package A11_List;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * java.util.Deque接口
 * 该接口继承自Queue，双端队列是队列两端都可以做进出队操作的队列。
 * @author M.C.
 *
 */
public class Demo06_Deque {

	public static void main(String[] args) {
		Deque<String>deque=new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");
		deque.offer("three");
		System.out.println(deque);
		
		deque.offerFirst("four");
		System.out.println(deque);
		deque.offerLast("five");
		System.out.println(deque);
		
		String str=deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str=deque.pollFirst();
		System.out.println(str);
		System.out.println(deque);
		
		str=deque.pollLast();
		System.out.println(str);
		System.out.println(deque);
		
	}

}
