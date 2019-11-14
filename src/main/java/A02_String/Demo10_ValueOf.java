package A02_String;
/**
 * java提供了一组重载的静态方法：valueOf
 * 作用是将其他类型转换为String。常用的是将基本类型转换为字符串
 * @author MC
 *
 */
public class Demo10_ValueOf {
	public static void main(String[] args) {
		int d=123;
		String s1=String.valueOf(d);
		System.out.println(s1);
		s1=d+"";
		System.out.println(s1);
	}
}
