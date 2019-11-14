package A11_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ���ϵ�����
 * ���Ϲ����ࣺjava.util.Collections��һ����̬����sort���Զ�List����
 * ������Ȼ���򣨴�С����
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
		//����
		Collections.sort(list);
		System.out.println(list);
		//����
		Collections.shuffle(list);
		System.out.println(list);
		
		
	}

}
