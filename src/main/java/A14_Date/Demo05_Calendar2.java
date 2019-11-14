package A14_Date;

import java.util.Calendar;

/**
 * int get(int field)
 * 获取指定时间分量对应的值
 * 时间分量为一个整数，calendar提供了大量的常量与之对应
 * @author M.C.
 *
 */
public class Demo05_Calendar2 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		//获取年
		int year=calendar.get(Calendar.YEAR);
		System.out.println("年："+year);
		//获取月
		int month=calendar.get(Calendar.MONTH)+1;
		System.out.println("月："+month);
		
		//获取日
		int day=calendar.get(Calendar.DATE);
		System.out.println("日："+day);
		
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		int dow=calendar.get(Calendar.DAY_OF_WEEK)-1;
		String data[]={"日","一","二","三","四","五","六"};
		System.out.println("周"+data[dow]);
		
		/*
		 * 获取指定时间分量所允许的最大值，参考日期就是当前Calendar表示的日期
		 */
		int max=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(max);
	}
}
