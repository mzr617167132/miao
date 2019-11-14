package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �û�ע�Ṧ��
 * @author Administrator
 * ע����Ϣ�������û��������룬�ǳƣ�����
 * ��������Ϊintֵ��������Ϊ�ַ���
 * 
 * �������û���Ϣ������user.dat�ļ���
 * 
 * ÿ����¼ռ��100�ֽڣ��������֣����룬�ǳƸ�ռ32�ֽڣ�����Ϊ�̶���4�ֽ�
 * �����ַ����������Ȳ��̶������ݣ�ͨ�����ǿ��Զ��������������ף�������ȡ�޸ķ���
 */
public class Demo06_Reg {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���");
		String username=sc.nextLine();
		System.out.println("����������");
		String password=sc.nextLine();
		System.out.println("�������ǳ�");
		String nickname=sc.nextLine();
		System.out.println("����������");
		int age=Integer.parseInt(sc.nextLine());
		
		RandomAccessFile raf=new RandomAccessFile("user.dat", "rw");
		//��ָ���Ƶ��ļ�ĩβ
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
