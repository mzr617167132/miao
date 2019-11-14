package A08_Exception;
/**
 * final,finally,finalize
 * final关键字，修饰类，方法，属性
 * finally 异常块中最后一定会走的程序
 * finalize Object中的必要方法，所有对象在被GC回收时，最后调用的方法
 * @author Administrator
 *
 */
public class Demo03_Finally02 {

	public static void main(String[] args) {
		System.out.println(
			test("0")+","+test(null)+","+test("")
		);
	}

	public static int test(String str){
		System.out.println("test方法执行了，参数为："+str);
		try {
			return str.charAt(0)-'0';
		} catch (NullPointerException e) {
			System.out.println("出现了空指针");
			return 1;
		}catch(Exception e){
			System.out.println("出现了其他异常");
			return 2;
		}finally{
			System.out.println("finally执行了");
			return 3;
		}
	}
	
	
}
