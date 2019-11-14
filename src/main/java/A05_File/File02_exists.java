package A05_File;

import java.io.File;
/**
 * boolean f=file.exists(); 
 * 判断当前File表示的文件或目录是否存在
 * @author Administrator
 *
 */
public class File02_exists {

	public static void main(String[] args) {
		/**
		 * 检查文件（文件夹）是否存在
		 */
		File file1=new File("D:/demo");
		File file2=new File("D:/demo2");
		/**
		 * File 提供了API方法 exists（）检查文件（文件夹）
		 * 是否已经存在，返回true则存在，false不存在
		 */
		boolean b1=file1.exists();
		boolean b2=file1.exists();
		System.out.println(b1+","+b2);
	
	
	
	}

}
