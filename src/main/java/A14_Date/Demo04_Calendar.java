package A14_Date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类
 * 用于操作时间的API，本身是一个抽象类，规定了日历类操作时间的相关功能
 * 常用实现类：GregorianCalendar 即：阳历
 * Calendar提供了一个静态方法：getInstance，可以根据当前系统
 * 所在地区获取一个适用的实现类，大部分地区获取的都是阳历。
 * @author M.C.
 *
 */
public class Demo04_Calendar {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * Date getTime()
		 * 以Date形式返回当前Calendar所表示的日期
		 */
		Date date=calendar.getTime();
		System.out.println(date);
		/**
		 * void setTime(Date date)
		 * 使当前Calendar表示给定的Date所表示的日期
		 */
		calendar.setTime(date);
		System.out.println(calendar);
	}

}
