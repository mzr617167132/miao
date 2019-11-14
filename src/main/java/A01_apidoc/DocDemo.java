package A01_apidoc;

/**
 * 文档注释 文档注释只用来说明三个地方： 
 * 类，方法，常量 
 * 它是功能级注释，是说明整个功能的，而不是某一句代码的意义。
 * 在类上使用，通常用来说明当前类的设计意图以及功能介绍。
 * 
 * @author MC
 * @version 版本:1.0 2018/12/25
 * @see 参见:java.lang.String
 * @since 始于JDK版本:JDK1.0
 */
public class DocDemo {
	/**
	 * sayHello方法中的问候语
	 */
	public static final String INFO = "你好！";

	/**
	 * 对给定的用户添加问候语
	 * 
	 * @param name 用户名字
	 * @return 含有问候语的字符串
	 */
	public String sayHello(String name) {
		return "你好！" + name;
	}
}
