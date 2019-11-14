package A08_Exception;
/**
 * 异常处理机制中的try-catch
 * 语法定义：
 * try{
 * 	可能出现异常的代码片段
 * }catch(XXXException){
 * 	当try块中的代码出现了XXXException后的处理代码
 * }
 * @author Administrator
 *
 */
public class Demo01_TryCatch {

	public static void main(String[] args) {
		System.out.println("程序开始了！");
		try{
//			String str=null;
			/**
			 * 当虚拟机执行到下面代码时，会出现空指针问题，于是虚拟机会实例化
			 * 一个NullPointerException
			 * 实例用于表示异常，并将代码执行过程设置到该异常实例中表明出错的位置，
			 * 然后将异常抛出。
			 */
//			System.out.println(str.length());
			String str="";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			//注意try语句块中报错代码以下的内容都不执行
			System.out.println("!!!!");
		}catch(NullPointerException e){
			System.out.println("出现了空指针");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("出现了下标越界");
			/**
			 * 我们可以在最后一个catch中捕获Exception，避免因为一个
			 * 未处理的异常导致程序中断。
			 */
		}catch(Exception e){
			System.out.println("反正出了个错");
		}
		System.out.println("程序结束了！");
	}
}
