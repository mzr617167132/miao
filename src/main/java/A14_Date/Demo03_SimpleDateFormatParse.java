package A14_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将一个字符串解析为Date
 * @author M.C.
 *
 */
public class Demo03_SimpleDateFormatParse {
	public static void main(String[] args) {
		String str="2008-08-08 20:08:08";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date=sdf.parse(str);
			System.out.println(date);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
