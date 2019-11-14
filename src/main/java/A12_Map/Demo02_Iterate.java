package A12_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * 遍历所有的key
 * 遍历所有的键值对
 * 遍历所有的value（不常用）
 * @author M.C.
 *
 */
public class Demo02_Iterate {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		map.put("语文", 99);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 95);
		System.out.println(map);
		/*
		 * 遍历所有的key
		 * Set keySet()
		 * 将当前Map中所有的key以一个Set集合形式返回。
		 */
		Set<String> keySet=map.keySet();
		for(String key:keySet){
			System.out.println("key:"+key);
		}
		/*
		 * 遍历每一组键值对
		 * Set entrySet（）
		 * 将当前Map中每一组键值对（若干Entry实例）以一个Set集合形式返回
		 * java.util.Map.Entry
		 * 其每个实例用于表示map中的一组键值对
		 */
		Set<Entry<String ,Integer>>entrySet=map.entrySet();
		for(Entry<String,Integer>e:entrySet){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
		}
		/*
		 * 遍历所有的value
		 * Collection values（）
		 * 将当前Map中私有云的value以一个集合形式返回
		 */
		Collection<Integer>values=map.values();
		for(Integer value:values){
			System.out.println("value:"+value);
		}
		
		
	}
}
