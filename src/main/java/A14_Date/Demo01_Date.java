package A14_Date;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个具体的时间点，内部维护一个long值，该值表示的是自
 * 1970年1月1日00:00：00到当前Date所表示的时间之间所经过的毫秒。
 * 由于Date设计存在时区以及千年虫问题，所以大部分操作时间的方法都被声明为过时的
 * 现在使用Date仅将他当做一个时间的容器，表示一个具体时间。
 * @author M.C.
 *
 */
public class Demo01_Date {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		long time =date.getTime();
		System.out.println(time);
		
		date.setTime(0);
		System.out.println(date);
	}

}
