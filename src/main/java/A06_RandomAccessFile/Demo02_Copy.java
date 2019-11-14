package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制
 * @author Administrator
 *
 */
public class Demo02_Copy {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile scr=new RandomAccessFile("./bee0.png", "r");
		RandomAccessFile desc=new RandomAccessFile("./bee0_cp.png", "rw");
		//保存每次实际读取的字节
		int d=-1;
		while((d=scr.read())!=-1){
			desc.write(d);
		}
		System.out.println("复制完成");
		scr.close();
		desc.close();
		
	}

}
