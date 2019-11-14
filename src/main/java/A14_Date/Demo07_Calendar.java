package A14_Date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * 对指定时间分量加上给定的值，若给定的值为负数，则是减去给定的值
 * @author M.C.
 *
 */
public class Demo07_Calendar {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/*
		 * 3年2个月零25天以后所在周的周五是哪天？
		 */
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		System.out.println(calendar.getTime());
	}

}
