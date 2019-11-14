package A04_Integer;
/**
 * ��װ��
 * ���ڻ������Ͳ���������������ԣ�������ʵ�ʿ����в����������
 * �����ǲ����Եģ��Դ˳����˰�װ�ࡣ�û������Ϳ����Զ�����ʽ���ڡ�
 * @author Administrator
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int d=128;
		/**
		 * �Ƽ�ʹ�þ�̬����valueOf��ʽ������װ��
		 */
		Integer i1=Integer.valueOf(d);
		Integer i2=Integer.valueOf(d);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		d=i1.intValue();
		float f=i1.floatValue();
		System.out.println(f);
		byte b=i1.byteValue();
		System.out.println(b);
		
		//��ȡint��ȡֵ��Χ
		System.out.println("int��ȡֵ��Χ");
		int imax=Integer.MAX_VALUE;
		System.out.println(imax);
		int imin=Integer.MIN_VALUE;
		System.out.println(imin);
		
		System.out.println("long��ȡֵ��Χ");
		long lmax=Long.MAX_VALUE;
		System.out.println(lmax);
		long lmin=Long.MIN_VALUE;
		System.out.println(lmin);
		
		System.out.println("double��ȡֵ��Χ");
		double dmax=Double.MAX_VALUE;
		System.out.println(dmax);
		double dmin=Double.MIN_VALUE;
		System.err.println(dmin);
		
		System.out.println("float��ȡֵ��Χ");
		float fmax=Float.MAX_VALUE;
		System.out.println(fmax);
		float fmin=Float.MIN_VALUE;
		System.out.println(fmin);
		
		System.out.println("short��ȡֵ��Χ");
		short smax=Short.MAX_VALUE;
		System.out.println(smax);
		short smin=Short.MIN_VALUE;
		System.out.println(smin);
		
		System.out.println("byte��ȡֵ��Χ");
		byte bmax=Byte.MAX_VALUE;
		System.out.println(bmax);
		byte bmin=Byte.MIN_VALUE;
		System.out.println(bmin);
		
		System.out.println("char��ȡֵ��Χ");
		char cmax=Character.MAX_VALUE;
		System.out.println(cmax);
		char cmin=Character.MIN_VALUE;
		System.out.println(cmin);
		
	}
}
