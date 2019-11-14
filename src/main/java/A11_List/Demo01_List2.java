package A11_List;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了获取子集的操作
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
		 * 获取当前集合中指定范围内的子集
		 */
		List<Integer>subList=list.subList(3, 8);
		System.out.println(subList);
		//将子集中每个元素扩大10倍
		for(int i=0;i<subList.size();i++){
			subList.set(i,subList.get(i)*10);
		}
		System.out.println(subList);
		/*
		 * 对子集操作就是对原集合对应元素的操作
		 */
		System.out.println(list);
		/*
		 * 删除list集合中2-8
		 */
		list.subList(2, 9).clear();
		System.out.println(list);
	}

}
