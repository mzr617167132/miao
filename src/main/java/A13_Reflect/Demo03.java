package A13_Reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) 
			throws Exception{
			/*
			 * 利用反射调用有参数的方法
			 */
			Scanner in = new Scanner(System.in);
			System.out.print("输入类名：");
			String className = in.nextLine();
			
			Class cls = Class.forName(className);
			Object obj = cls.newInstance();
			//在cls对应的类中查找 service(HttpRequest,HttpResponse)
			Method method = cls.getDeclaredMethod(
					"service", HttpRequest.class,
					HttpResponse.class);
			HttpRequest req=new HttpRequest();
			HttpResponse res = new HttpResponse();
			Object val = method.invoke(obj, req, res);
			System.out.println(val);//null
					
		}
}
