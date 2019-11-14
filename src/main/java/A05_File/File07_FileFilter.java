package A05_File;

import java.io.File;
import java.io.FileFilter;
/**
 * 过滤列目录的结果
 */
public class File07_FileFilter {

	public static void main(String[] args) {
		
		//文件过滤器，声明过滤条件方法
//		FileFilter filter=new FileFilter() {
//			//accept 接受，这里是设置过滤时候的接受条件
//			public boolean accept(File file) {
//				String name=file.getName();
//				return name.endsWith(".txt");
//			}
//		};
		
		FileFilter filter=(File file)->file.getName().endsWith(".txt");;
		File file=new File("D:/java");
		File[]files=file.listFiles(filter);
		for(File f:files){
			System.out.println(f);
		}
	}
}
