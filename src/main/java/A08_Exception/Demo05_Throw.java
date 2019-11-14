package A08_Exception;
/**
 * 异常的抛出
 * @author Administrator
 *
 */
public class Demo05_Throw {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		Person p=new Person();   
		try {
			/**
			 * 当我们调用一个含有欧throws声明异常抛出的方法时，
			 * 编译器要求我们必须处理该异常，而处理的手段有两种：
			 * 1：使用try-catch主动捕获并处理
			 * 2：在当前方法上继续使用throws声明该异常的抛出
			 * 具体使用哪种解决手段要结合实际开发需求
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
			System.out.println("message:"+e.getMessage());
		}
		System.out.println("年龄："+p.getAge());
		
		
		System.out.println("程序结束了");
	}

}
