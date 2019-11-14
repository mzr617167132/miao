package A07_IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java IO 标准的输入与输出
 * java通过IO提供了标准的统一的读写外界设备的方式。
 * 
 * 流按照方向分为输入与输出，而方向代表着功能：
 * 输入流：从外界到程序的方向，是用来获取数据的，是读操作
 * 输出流：从程序到外界的方向，是用来发送数据的，是写操作
 * 
 * java将流划分为两类，分别是节点流与处理流：
 * 节点流：又叫做低级流，是实际链接程序与数据源的管道，负责实际
 * “搬运”数据的流。所以数据源是明确的，读写一定是建立在节点流的基础上进行的。
 * 
 * 处理流：又叫做高级流。特点：不能独立存在（没有意义），必须连接在其他流上，目的
 * 是当数据流经当前流时可以对其进行某些加工处理，简化我们对数据的操作。
 * 
 * 流的使用通常是用若干高级流串联，并最终串联低级流，以流水线的加工处理后进行读写操作。
 * 这种串联流的操作也称为：流的连接，这也是IO的精髓所在。
 * 
 * java.io.InputStream与java.io.OutputStream是一对抽象类，也是
 * 所有字节输入流的超类，定义了所有字节流都应当具备的读写字节方法。
 * 
 * 文件流
 * java.io.FileInputStream:文件输入流，用于读取文件数据的流继承自InputStream
 * java.io.FileOutputStream：文件输出流，用于写数据到文件的流，继承自OutputStream
 * 
 * 文件流与RandomAccessFile
 * 文件流与RAF都是用来读写文件的API，但是底层的读写方式不同。
 * RAF是基于指针的随机读写形式，可以对文件任意位置进行读写，对于编辑文件内容等操作很灵活。
 * 文件流是基于IO标准的读写方式，是顺序读写的。即：只能顺序向后读或写，不可回退。但是利用
 * 流链接，我们可以串联各种高级流完成各种复杂数据的读写操作。
 *
 */
public class Demo01_FileOutputStream {

	public static void main(String[] args) throws IOException {
		/**
		 * 流有两种创建方式
		 * 1：覆盖写模式
		 * FileOutputStream（String path）
		 * FileOutputStream（File file）
		 * 这种创建方式，流若发现指定的文件已经存在，那么会先将该数据全部清除。然后将
		 * 通过流写入的内容写到文件中
		 * 
		 * 2：追加模式
		 * FileOutputStream（String path，boolean appen）
		 *FileOutputStream（File file，boolean appen）
		 *若文件已经存在，则数据全部保留，通过当前流写入的数据会被追加到文件末尾
		 */
//覆盖模式
		FileOutputStream fos=new FileOutputStream("fos.txt");
//追加模式
//		FileOutputStream fos=new FileOutputStream("fos.txt",true);
		String str="好嗨！感觉人生已经到达了高潮";
		byte []data=str.getBytes("utf-8");
		fos.write(data);
		fos.close();
	
	
	}

}
