package A11_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �����ַ���
 * @author M.C.
 *
 */
public class Demo04_SortList3 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("С����ʦ");
		list.add("����");
		list.add("����ʦ");
		System.out.println(list);
		//�����ַ��������򣨴��ٵ��ࣩ
		
		Collections.sort(list,new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		Collections.sort(list,(o1,o2)->o1.length()-o2.length());
		System.out.println(list);
	}

}
