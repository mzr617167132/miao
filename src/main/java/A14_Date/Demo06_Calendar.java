package A14_Date;

import java.util.Calendar;
import java.util.Date;

/**
 * void set(int field,int value)
 * ����ָ��ʱ�����Ϊ������ֵ
 * @author M.C.
 *
 */
public class Demo06_Calendar {

	public static void main(String[] args) {
		
		Integer count=countRest();
		System.out.println(count);
		
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DATE, 31);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.MONTH,10);
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.DATE, 32);
		System.out.println(calendar.getTime());
	
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		System.out.println(calendar.getTime());
	}
	
	/**
	 * ��ȡָ���·ݵ�����
	 * @param month
	 * @return
	 */
	private static Integer countDay(Date date) {
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DATE,1);//����������Ϊ���µ�һ�� 
		calendar.roll(Calendar.DATE,-1);//���ڻع�һ�죬Ҳ�������һ��  
		return calendar.get(Calendar.DATE);
	}
	/**
	 * ��ȡ�����м�����ĩ
	 * @return
	 */
	private static Integer countRest() {
		Calendar calendar=Calendar.getInstance();
		int rest=0;
		for(int i=1;i<=countDay(new Date());i++) {
			calendar.set(Calendar.DATE,i);
			int dow=calendar.get(Calendar.DAY_OF_WEEK);
			if(dow==1||dow==7) {
				rest++;
			}
		}
		return rest;
	}

}
