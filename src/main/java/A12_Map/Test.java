package A12_Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计给定字符串中每个字符出现的次数
 * @author M.C.
 *
 */
public class Test {

	public static void main(String[] args) {
		/*
		 * 定义一个Map，key出现的字符，value对应出现的次数
		 * 
		 * 首先遍历字符串中每个字符，得到一个字符后，首先
		 * 判断Map中作为key是否存在这个字符，不存在则说明
		 * 这个字符是第一次出现，那么put到map中，对应的次数
		 * 设置为1
		 * 若已经存在，说明该字符已经出现过，那么先从map中
		 * 获取这个字符出现的次数，并对其+1，然后再存入到
		 * map中即可
		 * 
		 * 遍历完毕后，输出map即看到了每个字符出现的次数
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
