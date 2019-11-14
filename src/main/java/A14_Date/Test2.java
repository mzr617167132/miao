package A14_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 计算商品促销日期
 * 
 * 程序启动后要求用户输入某商品的生产日期，格式：yyyy-MM-dd
 * 然后输入该商品的保质期天数
 * 经过程序计算后，输出该商品的促销日期，格式：yyyy-MM-dd
 * 促销日期计算规则：商品过期日前2周的周三
 * @author M.C.
 *
 */
public class Test2 {

	public static void main(String[] args) {
		System.out.println("请输入商品生产日期...");
		String cDate="2019-01-01";
		System.out.println("请输入保质期天数..");
		String bDate="89";
		int t=Integer.parseInt(bDate);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d1=sdf.parse(cDate);
			System.out.println(d1);
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(d1);
			System.out.println(calendar.getTime());
			
			calendar.add(Calendar.DAY_OF_YEAR,t );
			System.out.println(calendar.getTime());
			
			calendar.add(Calendar.DAY_OF_YEAR, -14);
			System.out.println(calendar.getTime());
			
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
			System.out.println(calendar.getTime());
			
			String line=sdf.format(calendar.getTime());
			System.out.println("促销日期为："+line);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
