package A05_File;

import java.io.File;
/**
 * Flie：文件系统中的一个文件或目录
 * 1.访问其表示的文件或目录的属性信息
 * 2.创建，删除文件或目录
 * 3.访问一个目录中的所有子项
 * 但是不能使用File访问文件数据.
 * @author Administrator
 * 
 * 创建目录
 * boolean b=dir.mkdir();
 * 
 * 创建父子目录a/b/c
 * boolean b=dir.mkdirs();        
 *
 */
public class File01_mkdir {

	public static void main(String[] args) {
		/**
		 * File API
		 * 1.可以使用绝对路径或者相对路径
		 * 2.路径分隔符
		 *    -Windows 系统是"\"
		 *    -java API中会自动的将/处理为\\
		 *    -Linux\Unix\Mac 系统是"/"
		 *    \称为反斜线，/称为斜线
		 */
		//new File 只是常见内存对象，不会创建文件夹
		//调用mkdir方法时候才创建文件夹
		File file=new File("D:/demo");
		//Linux 系统请使用：
		//File file = new File("/home/soft01/demo");
		
		//mkdir（）方法用于创建文件夹
		//返回值为true，表示创建成功，否则为失败
		boolean b=file.mkdir();
		
		File a=new File("D:/a/b/c/d/e");
		a.mkdirs();

	}

}
