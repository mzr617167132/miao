package A08_Exception;

/**
 * 使用这个类来测试异常的抛出
 * @author Administrator
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * throw关键字用于主动抛出一个方法
	 * throws是在声明方法的同时声明该方法可能抛出的异常，
	 * 这样编译器会检查调用该方法的代码片段有没有处理该异常
	 * 没有处理则编译不通过并提示强制处理
	 * 除了RuntimeException之外，其他类型的异常在
	 * 抛出时编译器都要求必须处理。
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age) throws IllegalAgeException {
		if(age>100||age<0){
			throw new IllegalAgeException("年龄不合法");
//			throw new RuntimeException("年龄不合法");
		}
		this.age = age;
	}
}
