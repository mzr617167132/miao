package A12_Map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表
 * Map是一个常用的数据结构，体现的样子是一个多行两列的表格
 * 其中左列称为key，右列称为value。
 * 存放元素时成对存入的，即key-value对形式保存。
 * 获取元素时根据key获取对应的value
 * 所以我们经常将一组数据及查询这些数据所使用的条件分别以value（要查询的数据）
 * 即对应的key（查询条件）进行保存。
 * Map要求key是不允许重复的。
 * 
 * Map本身是一个接口，定义了Map应当具有的功能。
 * 常用实现类：java.util.HashMap 散列表
 * 散列表是当今查询速度最快的数据结构
 * @author M.C.
 *
 */
public class Demo01_Map {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		/*
		 * V put(K k,V v)
		 * 将给定的一组键值存入到Map中。由于Map不允许重复的Key，所以若使用已有
		 * 的Key保存新的value时会将该Key原有的value覆盖，而put方法的返回值
		 * 就是被覆盖的value，若key不存在，则返回null。
		 */
		Integer num=map.put("语文", 99);
		System.out.println("num:"+num);
		map.put("数学", 98);
		map.put("英语", 97);
		map.put("物理", 96);
		map.put("化学", 95);
		System.out.println(map);
		num=map.put("语文", 88);
		System.out.println("num:"+num);
		System.out.println(map);
		/*
		 * Integer get(Obj key)
		 * 根据给定的key获取对应的value，若给定的key不存在，则返回值为null
		 */
		num=map.get("数学");
		System.out.println("数学："+num);
		num=map.get("体育");
		System.out.println("体育："+num);
		
		int size=map.size();
		System.out.println("size:"+size);
		/*
		 * V remove(obj key)
		 * 将给定的key对应的键值对删除，返回值为value，若没有删除
		 * 任何内容则返回值为null
		 */
		num=map.remove("化学");
		System.out.println(map);
		System.out.println("num:"+num);
		
		boolean ck=map.containsKey("物理");
		System.out.println("包含key："+ck);
		
		ck=map.containsValue(100);
		System.out.println("包含value："+ck);
		
	}
}
