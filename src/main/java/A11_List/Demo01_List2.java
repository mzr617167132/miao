package A11_List;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ�˻�ȡ�Ӽ��Ĳ���
 * @author M.C.
 *
 */
public class Demo01_List2 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println(list);
		/*
		 * List subList(int start,int end)
		 * ��ȡ��ǰ������ָ����Χ�ڵ��Ӽ�
		 */
		List<Integer>subList=list.subList(3, 8);
		System.out.println(subList);
		//���Ӽ���ÿ��Ԫ������10��
		for(int i=0;i<subList.size();i++){
			subList.set(i,subList.get(i)*10);
		}
		System.out.println(subList);
		/*
		 * ���Ӽ��������Ƕ�ԭ���϶�ӦԪ�صĲ���
		 */
		System.out.println(list);
		/*
		 * ɾ��list������2-8
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}

}
