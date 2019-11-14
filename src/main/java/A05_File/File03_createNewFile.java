package A05_File;

import java.io.File;
import java.io.IOException;
/**
 * boolean f=file.createNewFile() 
 * 创建当前File表示的文件
 * 
 * 文件夹和文件不能重名:创建了文件夹，就不能再创建文件了。
 */
public class File03_createNewFile {

	public static void main(String[] args) throws IOException {
		/**
		 * 利用File API创建新文件
		 */
		File file1=new File("D:/text.txt");
		/**
		 * createNewFile()会在磁盘上创建新文件
		 */
		boolean b=file1.createNewFile();
		System.out.println(b);
		/**
		 * 在文件夹中创建文件/文件夹
		 * new File（父文件夹，文件名）;
		 * 表示文件在文件夹中
		 */
		File demo=new File("D:/demo");
		demo.mkdirs();
		File file3=new File(demo,"myfile.txt");
		file3.createNewFile();
		File file4=new File(demo,"test");
		file4.mkdir();
		
		
		
		
	}

}
