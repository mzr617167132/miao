package A11_List;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue�ӿ�
 * ����
 * ���п��Ա���һ��Ԫ�أ����Ǵ�ȡԪ�ر�����ѭ�Ƚ��ȳ�ԭ��
 * Queue�ӿڼ̳���Collection������Ҳ��һ�ּ���
 * ����ʵ���ࣺLinkedList
 * @author M.C.
 *
 */
public class Demo05_Queue {

	public static void main(String[] args) {
		Queue<String>queue=new LinkedList<>();
		/*
		 * ��Ӳ�����������Ԫ����ӵ�����ĩβ
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * ���Ӳ�����������Ԫ�ش��б����Ƴ�
		 */
		String str=queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/*
		 * ���ö���Ԫ�أ���ȡ�����Ԫ����Ȼ�ڶ�����
		 */
		str=queue.peek();
		System.out.println(str);
		System.out.println(queue);
		
		//��������
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
