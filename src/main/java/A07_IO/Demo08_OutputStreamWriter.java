package A07_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java.io.Reader,java.io.Writer
 * 它们是所有字符流的超类，定义了所有字符流都必须具备的读写字符方法
 * 
 * java将流按照读写单位划分了字节流与字符流
 * 字符流的读写单位为字符，但是底层仍然是以字节为单位读写的
 * 但是在我们操作字符流时，我们是以字符为最小单位读写。
 * 而字符流会自动将字符与字节进行转换，所以字符流也仅适合读写【文本数据】
 * 
 * 转换流：
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 它们时非常常用的一对字符流实现类，并且是一对高级流。
 * 实际开发中，我们几乎不会直接操作它们，但是在使用字符流做流链接时，它是
 * 非常重要的一环。
 *
 *它们之所以称为转换流原因在于，java中其他的字符流通常都只能连接其他字符流
 *而我们实际应用中的大部分低级流都是字节流，这会导致那些高级的字符流不能直接
 *串联到字节流上，对此我们的解决方案是在他们之间连接转换流，因为转换流本身是
 *一对字符流，而它们又可以连接在字节流上，所以他们在流连接中起的作用就是“转换器”的效果
 */
public class Demo08_OutputStreamWriter {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("osw.txt");
		/**
		 * 构造方法：OutputStreamWriter（OutputStream out）
		 * 创建当前转换流并连接到指定的字节输出流上
		 * 
		 * OutputStreamWriter（OutputStream out ，String csn）
		 * 创建同时可以指定字符集，这样通过当前流写出的文本
		 * 数据都会按照给定的字符集转换为字节后写出
		 */
		OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
		osw.write("如果你乖给你买条gai");
		System.out.println("写出完毕");
		osw.close();
	}

}
