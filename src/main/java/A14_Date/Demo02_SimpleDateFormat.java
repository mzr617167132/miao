package A14_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以根据一个给定的日期格式在Date与String之间相互转换
 * @author M.C.
 *
 */
public class Demo02_SimpleDateFormat {

	public static void main(String[] args) {
		Date now=new Date();
		System.out.println(now);
		/*
		 * 2019-01-24 10:23:45
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E a");
		/*
		 * String format(Date date)
		 * 将给定的Date所表示的时间按照当前SDF指定的日期格式转换为字符串
		 */
		
		String line =sdf.format(now);
		System.out.println(line);
	}

}
