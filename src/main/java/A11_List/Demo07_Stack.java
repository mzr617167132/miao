package A11_List;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素，但是存取元素必须遵循先进后出原则
 * 通常使用栈是完成如：后退，前进等功能时使用。
 * java.util.Deque双端队列，如果只调用一侧的输入队方法就
 * 实现了栈结构，因此双端队列为栈提供了对应方法。
 * @author M.C.
 *
 */
public class Demo07_Stack {

	public static void main(String[] args) {
		Deque<String>stack=new LinkedList<>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		String str=stack.pop();
		System.out.println(str);
		System.out.println(stack);
		
		for(String s:stack){
			System.out.println(s);
		}
		
		for(;stack.size()>0;){
			System.out.println(stack.pop());
		}
		System.out.println(stack);
	}

}
