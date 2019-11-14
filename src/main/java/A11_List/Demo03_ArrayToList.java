package A11_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * ���鹤���ࣺArrays�ṩ��һ����̬����asList
 * ���Խ���ǰ����ת��Ϊһ��List����
 * @author M.C.
 *
 */
public class Demo03_ArrayToList {
	public static void main(String[] args) {
		String []arr={"one","two","three","four"};
		System.out.println("arr:"+Arrays.toString(arr));
		List<String>list=Arrays.asList(arr);
		System.out.println(list);
		/*
		 * �Դ�����ת���ļ��ϲ������Ƕ�ԭ����Ĳ���
		 */
		list.set(1, "2");
		System.out.println(list);
		System.out.println(Arrays.toString(arr));
		/*
		 * ���������Ƕ����ģ����Ի�Ӱ������Ԫ�ظ����Ĳ������ǲ�֧�ֵ�
		 * �����쳣
		 */
//		list.add("five");
//		System.out.println(list);
		
//		List<String>list2=new ArrayList<>(list);
//		list2.addAll(list);
		/*
		 * ���еļ��϶�֧��һ������ΪCollection�Ĺ��췽��
		 * �����Ǵ�����ǰ���ϵ�ͬʱ�������������е�����Ԫ��
		 */
		List<String>list2=new ArrayList<>(list);
		list2.add("five");
		System.out.println(list2);
	}

}
