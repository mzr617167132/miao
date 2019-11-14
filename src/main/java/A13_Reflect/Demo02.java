package A13_Reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 利用反射API动态加载类，并且动态创建对象
 * @author M.C.
 *
 */
public class Demo02 {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("输入类名：");
		String className=sc.nextLine();
		/*
		 * 动态加载类：加载成功返回Class类型的引用，代表加载以后
		 * 存储在方法区中的类信息。如果类名对应类不存在，则抛出没有找到的异常
		 */
		Class cls=Class.forName(className);
		System.out.println("类："+cls);
		/*
		 * newInstance()动态创建对象，对应类型必须包含无参数
		 * 可见构造器，否则抛出异常！
		 */
		Object obj=cls.newInstance();
		System.out.println(obj);
		
		String name=sc.nextLine();
		/*
		 * getDeclaredMethod获取cls类型上声明的方法信息，如果方法名不正确会抛出异常
		 */
		Method method=cls.getDeclaredMethod(name);
		//打开访问权限
		method.setAccessible(true);
		//执行（调用invoke）方法
		Object val=method.invoke(obj);
		System.out.println(val);
	}
}
