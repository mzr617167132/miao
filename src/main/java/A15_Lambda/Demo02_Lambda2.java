package A15_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �������в�����lambda
 * @author M.C.
 *
 */
public class Demo02_Lambda2 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("����ʦ");
		list.add("С����ʦ");
		list.add("����");
		Comparator<String> c=new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};
		
		/*
		 * ����������ݳ��������ʷ������������������ͣ�����������lambda��ָ����������
		 */
		Comparator<String> com=(o1,o2)->{
			return o1.length()-o2.length();
		};
		
		/*
		 * ��������Ҫ����ֵ��������ֻ��һ�����ʱ����ʡ��{}��ͬʱreturn�ؼ���ҲҪʡ��
		 */
		com=(o1,o2)->o1.length()-o2.length();
		
		Collections.sort(list,com);
		System.out.println(list);
		
	}

}
