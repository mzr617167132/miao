package A14_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ������Ʒ��������
 * 
 * ����������Ҫ���û�����ĳ��Ʒ���������ڣ���ʽ��yyyy-MM-dd
 * Ȼ���������Ʒ�ı���������
 * �������������������Ʒ�Ĵ������ڣ���ʽ��yyyy-MM-dd
 * �������ڼ��������Ʒ������ǰ2�ܵ�����
 * @author M.C.
 *
 */
public class Test2 {

	public static void main(String[] args) {
		System.out.println("��������Ʒ��������...");
		String cDate="2019-01-01";
		System.out.println("�����뱣��������..");
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
			System.out.println("��������Ϊ��"+line);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
