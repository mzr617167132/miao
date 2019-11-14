package A05_File;

import java.io.File;
/**
 * File f=file.delete();        
 * 将当前项目目录中的test.txt文件删除
 *
 * 只能删除文件和空文件夹
 */
public class File05_delete {

	public static void main(String[] args) {
		/**
		 * 删除文件delete()
		 * 返回boolean类型的值，如果为true表示删除了文件
		 * 如果返回false，则删除失败
		 * 如果文件已经不存在了，则返回false
		 * 
		 * 删除的是磁盘文件，删除后内存file对象还在！
		 * 不确定磁盘文件是否已经删除，可以利用exists方法检测。
		 */
		File file=new File("D:/abc");
		boolean b=file.delete();
		System.out.println(b);
		System.out.println(file.exists());
	}

}
