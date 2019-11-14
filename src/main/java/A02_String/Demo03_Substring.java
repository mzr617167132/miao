package A02_String;
/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串，start与end时两个下标。
 * 表示从哪里截取到哪里
 * 注意：java API有一个特点，通常用两个数字表示范围时
 * 都是“含头不含尾”。即：包含开始位置对应内容，但是不包含结束位置对应内容。
 * @author MC
 *
 */
public class Demo03_Substring {
	public static void main(String[] args) {
		//           01234567890
		String host="www.tedu.cn";
		
		String name=host.substring(4,8);
		System.out.println(name);
		
		name=host.substring(4);
		System.out.println(name);
	}
}
