package A08_Exception;

import java.io.FileOutputStream;

/**
 * JDk7发布时，出现了一个新的特性：自动关闭
 * 该特性是编译器认可的，可以让我们以更简便的方式处理IO的关闭
 * @author Administrator
 *
 */
public class Demo04_AutoCloserable {

	public static void main(String[] args) {
		/**
		 * 编译器最终会将代码改为在finally中关闭。
		 * 注try（）后中定义的内容必须实现了java.lang.AutoCloseable接口
		 * 否则编译不通过
		 */
		try (
			FileOutputStream fos=new FileOutputStream("fos.dat");	
		){
			fos.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
