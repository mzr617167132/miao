package A14_Date;

import java.util.Calendar;
import java.util.Date;

/**
 * void set(int field,int value)
 * 设置指定时间分量为给定的值
 * @author M.C.
 *
 */
public class Demo06_Calendar {

	public static void main(String[] args) {
		
		Integer count=countRest();
		System.out.println(count);
		
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DATE, 31);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.MONTH,10);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DATE, 32);
		System.out.println(calendar.getTime());
	
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		System.out.println(calendar.getTime());
	}
	
	/**
	 * 获取指定月份的天数
	 * @param month
	 * @return
	 */
	private static Integer countDay(Date date) {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DATE,1);//把日期设置为当月第一天 
		calendar.roll(Calendar.DATE,-1);//日期回滚一天，也就是最后一天  
		return calendar.get(Calendar.DATE);
	}
	/**
	 * 获取当月有几个周末
	 * @return
	 */
	private static Integer countRest() {
		Calendar calendar=Calendar.getInstance();
		int rest=0;
		for(int i=1;i<=countDay(new Date());i++) {
			calendar.set(Calendar.DATE,i);
			int dow=calendar.get(Calendar.DAY_OF_WEEK);
			if(dow==1||dow==7) {
				rest++;
			}
		}
		return rest;
	}

}
