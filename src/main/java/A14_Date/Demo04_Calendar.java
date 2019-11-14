package A14_Date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar ������
 * ���ڲ���ʱ���API��������һ�������࣬�涨�����������ʱ�����ع���
 * ����ʵ���ࣺGregorianCalendar ��������
 * Calendar�ṩ��һ����̬������getInstance�����Ը��ݵ�ǰϵͳ
 * ���ڵ�����ȡһ�����õ�ʵ���࣬�󲿷ֵ�����ȡ�Ķ���������
 * @author M.C.
 *
 */
public class Demo04_Calendar {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * Date getTime()
		 * ��Date��ʽ���ص�ǰCalendar����ʾ������
		 */
		Date date=calendar.getTime();
		System.out.println(date);
		/**
		 * void setTime(Date date)
		 * ʹ��ǰCalendar��ʾ������Date����ʾ������
		 */
		calendar.setTime(date);
		System.out.println(calendar);
	}

}
