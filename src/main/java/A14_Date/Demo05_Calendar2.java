package A14_Date;

import java.util.Calendar;

/**
 * int get(int field)
 * ��ȡָ��ʱ�������Ӧ��ֵ
 * ʱ�����Ϊһ��������calendar�ṩ�˴����ĳ�����֮��Ӧ
 * @author M.C.
 *
 */
public class Demo05_Calendar2 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		//��ȡ��
		int year=calendar.get(Calendar.YEAR);
		System.out.println("�꣺"+year);
		//��ȡ��
		int month=calendar.get(Calendar.MONTH)+1;
		System.out.println("�£�"+month);
		
		//��ȡ��
		int day=calendar.get(Calendar.DATE);
		System.out.println("�գ�"+day);
		
		int h=calendar.get(Calendar.HOUR_OF_DAY);
		int m=calendar.get(Calendar.MINUTE);
		int s=calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		int dow=calendar.get(Calendar.DAY_OF_WEEK)-1;
		String data[]={"��","һ","��","��","��","��","��"};
		System.out.println("��"+data[dow]);
		
		/*
		 * ��ȡָ��ʱ���������������ֵ���ο����ھ��ǵ�ǰCalendar��ʾ������
		 */
		int max=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(max);
	}
}
