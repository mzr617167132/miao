package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称
 * 程序启动后要求用户输入用户名以及要修改的昵称，然后将该用户对应的昵称进行修改
 * @author Administrator
 *
 */
public class Demo08_Update {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名");
		String yhname=sc.nextLine();
		System.out.println("请输入新的昵称");
		String yhnick=sc.nextLine();
		
		RandomAccessFile raf=new RandomAccessFile("user.dat", "rw");
		for(int i=0;i<raf.length()/100;i++){
			raf.seek(i*100);
			byte[]data=new byte[32];
			raf.read(data);
			String username=new String(data,"UTF-8").trim();
			if(yhname.equals(username)){
				raf.seek(i*100+64);
				data=yhnick.getBytes("UTF-8");
				data=Arrays.copyOf(data, 32);
				raf.write(data);
				System.out.println("修改成功");
				return;
			}
		}
		
		System.out.println("查无此人");
		raf.close();
	}

}
