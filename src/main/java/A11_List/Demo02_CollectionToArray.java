package A11_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * Collection�ṩ��һ��������toArray�����Խ���ǰ����ת��Ϊһ������
 * @author M.C.
 *
 */
public class Demo02_CollectionToArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		String[]array=list.toArray(new String[list.size()]);
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
		
	}

}
