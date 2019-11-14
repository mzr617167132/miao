package A11_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合的排序
 * 集合工具类：java.util.Collections有一个静态方法sort可以对List集合
 * 进行自然排序（从小到大）
 * @author M.C.
 *
 */
public class Demo04_SortList {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		Random random=new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		//排序
		Collections.sort(list);
		System.out.println(list);
		//乱序
		Collections.shuffle(list);
		System.out.println(list);
		
		
	}

}
