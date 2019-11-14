package A08_Exception;
/**
 * finally块是异常处理机制中最后一块
 * 它可以直接跟在try之后或者最后一个catch之后。
 * finally可以保证只要程序执行到try语句块中，那么无论try中
 * 的代码是否抛出异常，finally块中的代码都必定执行。
 * 
 * 所以我们通常将不关乎程序保错而都要执行的代码放在其中，
 * 比如IO操作完毕的流关闭。
 * @author Administrator
 *
 */
public class Demo02_Finally {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str="";
			System.out.println(str.length());
			return;
		} catch (Exception e) {
			System.out.println("出错了！");
		}finally{
			System.out.println("finally代码执行了");
		}
		System.out.println("程序结束了");
	}

}
