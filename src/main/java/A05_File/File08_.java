package A05_File;

import java.io.File;
/**
 * 递归删除文件
 * 1.递归必须能够收敛结束
 * 	  -不能进行无限度递归，必须能够结束
 *    -避免递归层次太深
 * 2.递归化繁为简的解决问题，只需要考虑第一层
 */
public class File08_ {

	public static void main(String[] args) {
		File file=new File("D:/demo8");
		del(file);
		System.out.println("finish");
	}
	
	/**
	 * 递归删除文件
	 */
	public static void del(File file){
	/**
	 *检查参数file的类型:
	 *1.如果是文件夹，则先删除文件夹的内容然后在删除文件夹
	 *2.如果不是文件夹则直接删除文件
	 * 
	 */
		if(file.isDirectory()){
			//删除文件夹内容
			File[]files=file.listFiles();
			for(File f:files){
				//利用递归复用当前方法
				del(f);
			}
		}
		System.out.println(file);
		file.delete();
	}
}
