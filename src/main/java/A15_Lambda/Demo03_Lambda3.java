package A15_Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * JDk8֮�󣬼���Ϊlambda�ṩ���µı����ķ�ʽ��foreach����
 * @author M.C.
 *
 */
public class Demo03_Lambda3 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("����ʦ");
		list.add("С����ʦ");
		list.add("����");
		/*
		 * API �ֲ���ȷ˵����һ��������ȫ�ļ��ϣ�����Ԫ�ز�����add��remove��
		 * Ҳ��������������������⣬����ζ�Ŷ��̲߳��������ü���ʱ�������������ɾ
		 * Ԫ��ͬʱִ����Ȼ���ڲ�����ȫ���⡣
		 * ����JDK8֮���foreach����������û������ģ���Ϊ�÷������ü�������ķ���
		 * ������Ȼ���Ժ������add��remove�ȷ�������
		 */
		for(String str:list){
			System.out.println(str);
		}
		//���ü����ǲ�����ȫ�ģ���ôforeachҲ�ǲ�����ȫ��
		list.forEach((e)->System.out.println(e));
	}

}
