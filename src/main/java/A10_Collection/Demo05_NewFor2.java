package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ʹ����ѭ����������
 * @author M.C.
 *
 */
public class Demo05_NewFor2 {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		/*
		 * ��ѭ���������ϻᱻ��������Ϊ���������������Բ�Ҫ����ѭ����������
		 * ��ͨ�����ϵķ�����ɾԪ��
		 */
		for(String str:c){
			System.out.println(str);
		}
	}

}
