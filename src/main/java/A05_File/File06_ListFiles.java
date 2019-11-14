package A05_File;

import java.io.File;

/**
 * dir.listFiles()      
 * 返回当前目录中的所有子项，每个子项会以file实例形式表示
 * 
 * 列出文件夹的内容
 * 1.必须在文件夹上调用此方法，如果在文件上调用
 *   此方法则返回空值null`
 * 2.返回值是文件夹内容，也就是文件夹中的文件和子文件夹。
 *   返回值类型是File[]数组  
 *
 */
public class File06_ListFiles {
	public static void main(String[] args) {
		File dir=new File("D:/demo8");
		File[]files=dir.listFiles();
//		for(int i=0;i<files.length;i++){
//			File file=files[i];
//			System.out.println(file);
//		}
		for(File file:files){
			System.out.println(file);
		}
		
		
	}
}
