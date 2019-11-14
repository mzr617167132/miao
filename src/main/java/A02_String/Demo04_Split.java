package A02_String;

import java.util.Arrays;
/**
 * String[] split(String regex)
 * 拆分字符串，将当期字符串按照满足正则表达式要求的部分进行拆分，
 * 然后将拆分的各部分以一个字符串数组形式返回
 * @author MC
 *
 */
public class Demo04_Split {
	public static void main(String[] args) {
		String str="abc123def456ghi";
		
		String[]array=str.split("[0-9]+");
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
	
	}
}
