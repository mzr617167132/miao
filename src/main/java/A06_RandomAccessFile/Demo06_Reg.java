package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册功能
 * @author Administrator
 * 注册信息包括：用户名，密码，昵称，年龄
 * 其中年龄为int值，其他的为字符串
 * 
 * 将所有用户信息保存在user.dat文件中
 * 
 * 每条记录占用100字节，其中名字，密码，昵称各占32字节，年龄为固定的4字节
 * 对于字符串这样长度不固定的数据，通常我们可以定长，并故意留白，这样读取修改方便
 */
public class Demo06_Reg {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名");
		String username=sc.nextLine();
		System.out.println("请输入密码");
		String password=sc.nextLine();
		System.out.println("请输入昵称");
		String nickname=sc.nextLine();
		System.out.println("请输入年龄");
		int age=Integer.parseInt(sc.nextLine());
		
		RandomAccessFile raf=new RandomAccessFile("user.dat", "rw");
		//将指针移到文件末尾
		raf.seek(raf.length());
		byte[]data=username.getBytes("UTF-8");
		data=Arrays.copyOf(data,32);
		raf.write(data);
		
		data=password.getBytes("UTF-8");
		data=Arrays.copyOf(data,32);
		raf.write(data);
		
		data=nickname.getBytes("UTF-8");
		data=Arrays.copyOf(data,32);
		raf.write(data);
		
		raf.writeInt(age);
		
		raf.close();
		
		
		
		
		
	}
}
