package A15_Lambda;
/**
 * lambda表达式
 * Jdk8之后推出的一个新的特性
 * 
 * 语法定义：
 * ([args..])->{
 * 	  方法体代码
 * }
 * 
 * lambda可以用更精简的代码创建匿名内部类，
 * 但是有一个前提条件，实现的接口必须有且只能有一个抽象方法
 * @author M.C.
 *
 */
public class Demo01_Lambda {

	public static void main(String[] args) {
		
		Runnable r1=new Runnable() {
			public void run() {
			}
		};
		   
		
		Runnable r2=()-> {
			System.out.println("hello");
			System.out.println("两句代码要有{}");
		};
		
		Runnable r3=()->System.out.println("一句代码可以省略{}");

	}

}
