package A14_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后要求用户输入自己的生日，格式：yyyy-MM-dd
 * 然后经过程序计算，输出到今天为止一共活了多少天
 * 再输出其出生10000天的纪念日为哪天，格式：yyyy-MM-dd
 * @author M.C.
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("请输入你的生日，格式为：yyyy-MM-dd");
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
			System.out.println("你一共活了"+day+"天");
			
			t1=t1+10000L*24*60*60*1000;
			System.out.println(t1);
			String line=sdf.format(t1);
			System.out.println(line);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
