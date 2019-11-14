package A11_List;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List�ӿ�
 * List�̳���Collection������һ�����ظ����ϣ���������
 * �ṩ��һ����еķ������ǿ���ͨ���±����Ԫ�صġ�
 * 
 * ����ʵ���ࣺ
 * java.util.ArrayList:�ڲ�������ʵ�֣���ѯЧ�ʸ���
 * java.util.LinkedList:�ڲ�������ʵ�֣���ɾЧ�ʺã�����
 * ��β��ɾЧ����á�
 * û�ж����ܼ��˿���Ҫ����ͨ����ArrayList���ɡ�
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
		 * ������Ԫ�ز��뵽ָ��λ��
		 * 
		 * [one,two,2,three,four]
		 */
		list.add(2,"2");
		System.out.println(list);
		/*
		 * ɾ��������ָ��λ�ö�Ӧ��Ԫ��
		 */
		String old=list.remove(1);
		System.out.println(list);
		System.out.println("��ɾ��Ԫ���ǣ�"+old);
		/*
		 * [one,2,3,four]
		 * E set(int index,E e)
		 * �ø���Ԫ���滻ָ��λ�õ�Ԫ�أ��������滻Ԫ�ط��ء�
		 */
		old=list.set(3, "3");
		System.out.println("���滻��Ԫ���ǣ�"+old);
		System.out.println(list);
		/*
		 * E get(int index)
		 * ��ȡָ���±�λ�ö�Ӧ��Ԫ��
		 */
		String str=list.get(3);
		System.out.println(str);
		for(int i=0;i<list.size();i++){
			str=list.get(i);
			System.out.println(str);
		}
	}
}
