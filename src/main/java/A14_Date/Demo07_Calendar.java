package A14_Date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * ��ָ��ʱ��������ϸ�����ֵ����������ֵΪ���������Ǽ�ȥ������ֵ
 * @author M.C.
 *
 */
public class Demo07_Calendar {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		/*
		 * 3��2������25���Ժ������ܵ����������죿
		 */
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		System.out.println(calendar.getTime());
	}

}
