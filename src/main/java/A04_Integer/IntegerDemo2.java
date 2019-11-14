package A04_Integer;
/**
 * JDK5推出后，推出了一个特性：自动拆装箱
 * 即：编译器会补充代码将基本类型与对应的包装类进行互转
 * 而无需我们再添加额外的转换代码。
 * @author Administrator
 *
 */
public class IntegerDemo2 {

	public static void main(String[] args) {
		/**
		 * 触发了自动装箱特性，编译器会补全代码，将
		 * 基本类型转换为包装类
		 * Integer in=Integer.valueOf(1);
		 */
		 Integer in=1;
		/**
		 * 触发了自动拆箱特性
		 * 下面代码会被编译器改为
		 * int a=in.intValue();
		 */
		int a=in;
		System.out.println(in);
	}

}
