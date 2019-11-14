package A05_File;

import java.io.File;
import java.io.IOException;

/**
 * File 提供了方法，检查file对象是文件还是文件夹
 * 1.如果不存在，isFile（），isDirectory（）
 *   都返回false
 * 2.如果存在：
 *   1.如果被检查目标是文件夹则isDirectory（）
 *     返回true，isFile（）返回false
 *   2.如果被检查目标是文件，isDirectory（）
 *     返回false，isFile（）返回true  
 * 
 * 判断当前File是否为一个文件
 * boolean b=file.isFile();
 * 判断当前File是否为一个目录     
 * boolean b=file.isDirectoty();
 */
public class File04_isFileAndisDirectory {

	public static void main(String[] args) throws IOException {
		File file=new File("D:/abc");
		
		file.createNewFile();
//		file.mkdir();
		
		boolean b1=file.isFile();
		boolean b2=file.isDirectory();
		System.out.println(b1+","+b2);
		
	}

}
