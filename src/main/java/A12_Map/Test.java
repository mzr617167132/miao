package A12_Map;

import java.util.HashMap;
import java.util.Map;

/**
 * ͳ�Ƹ����ַ�����ÿ���ַ����ֵĴ���
 * @author M.C.
 *
 */
public class Test {

	public static void main(String[] args) {
		/*
		 * ����һ��Map��key���ֵ��ַ���value��Ӧ���ֵĴ���
		 * 
		 * ���ȱ����ַ�����ÿ���ַ����õ�һ���ַ�������
		 * �ж�Map����Ϊkey�Ƿ��������ַ�����������˵��
		 * ����ַ��ǵ�һ�γ��֣���ôput��map�У���Ӧ�Ĵ���
		 * ����Ϊ1
		 * ���Ѿ����ڣ�˵�����ַ��Ѿ����ֹ�����ô�ȴ�map��
		 * ��ȡ����ַ����ֵĴ�����������+1��Ȼ���ٴ��뵽
		 * map�м���
		 * 
		 * ������Ϻ����map��������ÿ���ַ����ֵĴ���
		 */
		String line="helloworld!!! i love java!";
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<line.length();i++){
			String a=line.charAt(i)+"";
			Integer b=map.get(a);
			if(b==null){
				map.put(a, 1);
			}else{
				b++;
				map.put(a, b);
			}
		}
		System.out.println(map);
	}

}
