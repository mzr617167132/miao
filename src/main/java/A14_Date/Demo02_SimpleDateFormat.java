package A14_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ���Ը���һ�����������ڸ�ʽ��Date��String֮���໥ת��
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
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss E a");
		/*
		 * String format(Date date)
		 * ��������Date����ʾ��ʱ�䰴�յ�ǰSDFָ�������ڸ�ʽת��Ϊ�ַ���
		 */
		
		String line =sdf.format(now);
		System.out.println(line);
	}

}
