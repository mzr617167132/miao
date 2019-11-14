package A11_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ���ǳ��õļ���ʵ���ࣺ
 * ArrayList,LinkedList,HashSet�������̰߳�ȫ�ģ��ڶ��߳�
 * �����ʹ�û��������
 * collections�ṩ�˷������Խ������ļ���ת��Ϊ�̰߳�ȫ��
 * @author M.C.
 *
 */
public class Demo08_Sync {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("one");
		list.add("three");
		list.add("two");
		list.add("four");
		System.out.println(list);
		//��������List����ת��Ϊ�̰߳�ȫ��
		list=Collections.synchronizedList(list);
		System.out.println(list);
		
		
		Set<String>set=new HashSet<>(list);
		System.out.println(set);
		set=Collections.synchronizedSet(set);
		System.out.println(set);
	}

}
