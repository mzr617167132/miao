package A11_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排列字符串
 * @author M.C.
 *
 */
public class Demo04_SortList3 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("小泽老师");
		list.add("传奇");
		list.add("苍老师");
		System.out.println(list);
		//按照字符个数排序（从少到多）
		
		Collections.sort(list,new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		Collections.sort(list,(o1,o2)->o1.length()-o2.length());
		System.out.println(list);
	}

}
