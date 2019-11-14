package A02_String;
/**
 * 字符串是不变对象，即：对象一旦创建内容不可改变，若改变一定会创建新对象。
 * java推荐我们使用字面量形式创建字符串对象，这样可以重用内容一样的字符串
 * 对象来减少内存开销。
 * @author MC
 *
 */
public class Demo01_String {
	public static void main(String[] args) {
		//          字面量  直接量
		String s1="123abc";
		String s2="123abc";
		String s3="123abc";
		//s2,s3重用了s1对象
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//true
		//修改内容会创建新对象
		s1=s1+"!";
		System.out.println(s1);//123abc!
		//s1已经不再指向原对象
		System.out.println(s1==s2);//false
		//不影响s2，s3引用
		System.out.println(s2==s3);//true
		
		String s4=new String("123abc");
		System.out.println("s4:"+s4);
		System.out.println(s2==s4);//false
		/*
		 * 编译器有一个优化，即：当编译器在编译源代码时，若发现一个计算表达式参与
		 * 的值都是字面量时，即：计算结果可以在编译期确定时，那么编译器会直接进行
		 * 计算，并将结果编译到字节码文件中，这样就没有必要让虚拟机每次运行时再计算。
		 * 下面代码会被编译器改为：
		 * String s5=“123abc”；
		 */
		String s5="123"+"abc";
		System.out.println("s5:"+s5);
		System.out.println(s2==s5);//true
		
		String s="123";
		//其中一个是变量，编译器不会进行计算。
		String s6=s+"abc";
		System.out.println(s2=s6);//false
		
		String s7='1'+23+"abc";
		System.out.println(s7);
		System.out.println(s2==s7);//false
	
	}
}
