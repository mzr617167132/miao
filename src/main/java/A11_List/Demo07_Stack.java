package A11_List;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ�ṹ
 * ջ���Ա���һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ�Ƚ����ԭ��
 * ͨ��ʹ��ջ������磺���ˣ�ǰ���ȹ���ʱʹ�á�
 * java.util.Deque˫�˶��У����ֻ����һ�������ӷ�����
 * ʵ����ջ�ṹ�����˫�˶���Ϊջ�ṩ�˶�Ӧ������
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
