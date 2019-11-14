package A11_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 集合转换为数组
 * Collection提供了一个方法：toArray，可以将当前集合转换为一个数组
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
