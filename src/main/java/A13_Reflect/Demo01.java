package A13_Reflect;


import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.plaf.synth.SynthSpinnerUI;

import A11_List.Point;

/**
 * 反射检查对象的具体类型
 * java反射机制可以在程序运行期间动态获取一个类的信息，从而做到在
 * 运行期决定实例化某个类，获取其定义的方法和属性并且进行调用。
 * 利用反射机制可以提高代码的灵活性，但是不能过度的依赖反射机制。
 * @author M.C.
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception, IOException {
		/**
		 * 类对象：Class
		 * 类对象的每个实例用于表示JVM加载的一个类，每个被JVM
		 * 加载的类都有且只有一个类对象的实例与之对应
		 * 通过类对象可以获取其表示的类的一系列信息：获取类名字，
		 * 类定义的构造方法，属性，方法，超类等等信息
		 *反射是基于类对象进行的
		 *
		 *获取一个类的类对象方式主要有：
		 *1：每个类都有一个静态属性class，可以用于获取该类的类对象
		 *	比如：String.class,int.class
		 *2:使用Class的静态方法forName，指定要加载的类的完全限定名（包名.类名）
		 *	记载并获取该类的类对象
		 *3：使用类加载器ClassLoader加载指定的类
		 */
		test(true);
		
	}
	
	
	public static void test(Object obj){
		/*
		 * obj 引用的对象具体是啥类型？
		 * 反射API 可以检查对象的类型
		 * Object 类上定义，用于动态返回当前对象的具体类型
		 */
		Class cls=obj.getClass();
		System.out.println(cls);
		/**
		 * Class 提供的反射API可以获取类的内部结构
		 * 
		 * Declared：声明的
		 * Fields：字段，属性
		 */
		Field[]fields=cls.getDeclaredFields();
		for(Field f:fields){
			System.out.println(f);
		}
		System.out.println("***************");
		//可以获取类的内部方法
		Method[]methods=cls.getDeclaredMethods();
		for(Method m:methods){
			System.out.println(m);
		}
		System.out.println("***************");
		Constructor[] constructors=cls.getDeclaredConstructors();
		for(Constructor c:constructors){
			System.out.println(c);
		}
	}
	
}
