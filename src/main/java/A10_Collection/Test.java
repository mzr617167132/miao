package A10_Collection;


import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		int a=1;
		String b="hello";
		Point p=new Point(1,2);
		Collection c=new ArrayList();
		c.add(p);
		
		test(a,b,p,c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(p);
		System.out.println(c);
	}
	
	public static void test(int a,String b,Point p,Collection c){
		a++;
		b=b+a+"!!!";
		p.setX(4);
		p=new Point(5,6);
		p.setX(7);
		c.clear();
		c.add(p);
		c=new ArrayList<>();
		p=new Point(8,9);
		c.add(p);
		
	}
}
