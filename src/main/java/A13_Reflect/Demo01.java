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
 * ���������ľ�������
 * java������ƿ����ڳ��������ڼ䶯̬��ȡһ�������Ϣ���Ӷ�������
 * �����ھ���ʵ����ĳ���࣬��ȡ�䶨��ķ��������Բ��ҽ��е��á�
 * ���÷�����ƿ�����ߴ��������ԣ����ǲ��ܹ��ȵ�����������ơ�
 * @author M.C.
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception, IOException {
		/**
		 * �����Class
		 * ������ÿ��ʵ�����ڱ�ʾJVM���ص�һ���࣬ÿ����JVM
		 * ���ص��඼����ֻ��һ��������ʵ����֮��Ӧ
		 * ͨ���������Ի�ȡ���ʾ�����һϵ����Ϣ����ȡ�����֣�
		 * �ඨ��Ĺ��췽�������ԣ�����������ȵ���Ϣ
		 *�����ǻ����������е�
		 *
		 *��ȡһ����������ʽ��Ҫ�У�
		 *1��ÿ���඼��һ����̬����class���������ڻ�ȡ����������
		 *	���磺String.class,int.class
		 *2:ʹ��Class�ľ�̬����forName��ָ��Ҫ���ص������ȫ�޶���������.������
		 *	���ز���ȡ����������
		 *3��ʹ���������ClassLoader����ָ������
		 */
		test(true);
		
	}
	
	
	public static void test(Object obj){
		/*
		 * obj ���õĶ��������ɶ���ͣ�
		 * ����API ���Լ����������
		 * Object ���϶��壬���ڶ�̬���ص�ǰ����ľ�������
		 */
		Class cls=obj.getClass();
		System.out.println(cls);
		/**
		 * Class �ṩ�ķ���API���Ի�ȡ����ڲ��ṹ
		 * 
		 * Declared��������
		 * Fields���ֶΣ�����
		 */
		Field[]fields=cls.getDeclaredFields();
		for(Field f:fields){
			System.out.println(f);
		}
		System.out.println("***************");
		//���Ի�ȡ����ڲ�����
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
