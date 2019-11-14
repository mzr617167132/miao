package A13_Reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo03 {
	public static void main(String[] args) 
			throws Exception{
			/*
			 * ���÷�������в����ķ���
			 */
			Scanner in = new Scanner(System.in);
			System.out.print("����������");
			String className = in.nextLine();
			
			Class cls = Class.forName(className);
			Object obj = cls.newInstance();
			//��cls��Ӧ�����в��� service(HttpRequest,HttpResponse)
			Method method = cls.getDeclaredMethod(
					"service", HttpRequest.class,
					HttpResponse.class);
			HttpRequest req=new HttpRequest();
			HttpResponse res = new HttpResponse();
			Object val = method.invoke(obj, req, res);
			System.out.println(val);//null
					
		}
}
