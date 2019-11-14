package A12_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���
 * �������е�key
 * �������еļ�ֵ��
 * �������е�value�������ã�
 * @author M.C.
 *
 */
public class Demo02_Iterate {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("����", 99);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 95);
		System.out.println(map);
		/*
		 * �������е�key
		 * Set keySet()
		 * ����ǰMap�����е�key��һ��Set������ʽ���ء�
		 */
		Set<String> keySet=map.keySet();
		for(String key:keySet){
			System.out.println("key:"+key);
		}
		/*
		 * ����ÿһ���ֵ��
		 * Set entrySet����
		 * ����ǰMap��ÿһ���ֵ�ԣ�����Entryʵ������һ��Set������ʽ����
		 * java.util.Map.Entry
		 * ��ÿ��ʵ�����ڱ�ʾmap�е�һ���ֵ��
		 */
		Set<Entry<String ,Integer>>entrySet=map.entrySet();
		for(Entry<String,Integer>e:entrySet){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
		}
		/*
		 * �������е�value
		 * Collection values����
		 * ����ǰMap��˽���Ƶ�value��һ��������ʽ����
		 */
		Collection<Integer>values=map.values();
		for(Integer value:values){
			System.out.println("value:"+value);
		}
		
		
	}
}
