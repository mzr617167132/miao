package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF是专门用来读写文件数据的API
 * 其基于指针可以访问一个文件的任意位置并进行读写数据操作，
 * 使用它对文件数据编辑是非常简单
 * 创建RAF时有两种模式
 * “r”：只读模式，仅做读写操作，文件不存在，则抛出异常
 * “rw”：读写模式，可以对文件数据进行读或写操作,如果文件不存在，则自动创建
 * RAF提供常见构造方法
 * RandomAccessFile(file f,String mode)
 * RandomAccessFile(String path,String mode)
 * 
 * 读取到文件最后时候，返回 -1 表示到文件末尾了
 *
 */
public class Demo01_Raf {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("D:/demo.dat", "rw");
		//获取raf当前文件指针位置
//		raf.seek(raf.length());
		long p=raf.getFilePointer();
		System.out.println(p);
		raf.write(65);
		p=raf.getFilePointer();
		System.out.println(p);
		
		raf.seek(0);
		int b=raf.read();
		System.out.println(b);
		raf.close();
	}
}
