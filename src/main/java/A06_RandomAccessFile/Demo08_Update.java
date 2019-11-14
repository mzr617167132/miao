package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �޸��ǳ�
 * ����������Ҫ���û������û����Լ�Ҫ�޸ĵ��ǳƣ�Ȼ�󽫸��û���Ӧ���ǳƽ����޸�
 * @author Administrator
 *
 */
public class Demo08_Update {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���");
		String yhname=sc.nextLine();
		System.out.println("�������µ��ǳ�");
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
				System.out.println("�޸ĳɹ�");
				return;
			}
		}
		
		System.out.println("���޴���");
		raf.close();
	}

}
