package A03_Object;
/**
 * 测试Object的toString与equals
 * @author Administrator
 *
 */
public class Demo {

	public static void main(String[] args) {
		Point p=new Point(1,2);
		/**
		 * Object提供的toString方法返回的字符串为：
		 * 对象的句柄
		 * 格式：
		 * 类型@地址
		 * 该方法实际开发意义不大，如果需要使用这个方法，通常我们就要重写它
		 * 注：
		 * java提供的类基本上都重写了该方法，只有我们自己定义的类要额外重写。
		 * 
		 * toString方法实际开发中我们很少直接调用，但是在使用API时经常被
		 * 它们调用。
		 */
		String str=p.toString();
		System.out.println(str);
		/**
		 * System.out.println（Object o）
		 * 该方法就是将给定对象toString方法返回的字符串输出到控制台的
		 */
		System.out.println(p);  //直接调用了toString
		/**
		 * 字符串连接其他对象时，也是先调用该对象的toString方法，将返回
		 * 的字符串进行连接。
		 */
		str="point:"+p;       
		System.out.println(str);
		
		
		Point p2=new Point(1,2);
		System.out.println(p==p2);          //false
		System.out.println(p.equals(p2));  //true
		
		
		
		
		
		
		
		
		
		
	}

}
