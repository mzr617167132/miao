package A04_Integer;
/**
 * 包装类提供了一个静态方法：parseXXX（String str）
 * 可以将给定的字符串解析为对应的基本类型
 * 需要注意：该字符串必须正确描述基本类型可以保存的值，否则会
 * 抛出解析异常。 
 * @author Administrator
 *
 */
public class ParseDemo {

	public static void main(String[] args) {
		String str="123";
		int i=Integer.parseInt(str);
		System.out.println(i);
		
		double b=Double.parseDouble(str);
		System.out.println(b);

	}

}
