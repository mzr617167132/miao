package A14_Date;

import java.util.Date;

/**
 * java.util.Date
 * Date��ÿһ��ʵ�����ڱ�ʾһ�������ʱ��㣬�ڲ�ά��һ��longֵ����ֵ��ʾ������
 * 1970��1��1��00:00��00����ǰDate����ʾ��ʱ��֮���������ĺ��롣
 * ����Date��ƴ���ʱ���Լ�ǧ������⣬���Դ󲿷ֲ���ʱ��ķ�����������Ϊ��ʱ��
 * ����ʹ��Date����������һ��ʱ�����������ʾһ������ʱ�䡣
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
