package A14_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ����������Ҫ���û������Լ������գ���ʽ��yyyy-MM-dd
 * Ȼ�󾭹�������㣬���������Ϊֹһ�����˶�����
 * ����������10000��ļ�����Ϊ���죬��ʽ��yyyy-MM-dd
 * @author M.C.
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("������������գ���ʽΪ��yyyy-MM-dd");
//		Scanner sc=new Scanner(System.in);
//		String yh=sc.nextLine();
		String yh="2000-10-10";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date time1=sdf.parse(yh);
			long t1=time1.getTime();
			System.out.println(t1);
			
			Date now=new Date();
			long t2=now.getTime();
			System.out.println(t2);
			
			long day=(t2-t1)/1000/60/60/24;
			System.out.println("��һ������"+day+"��");
			
			t1=t1+10000L*24*60*60*1000;
			System.out.println(t1);
			String line=sdf.format(t1);
			System.out.println(line);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
