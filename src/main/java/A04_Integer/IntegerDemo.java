package A04_Integer;
/**
 * 包装类
 * 由于基本类型不具有面向对象特性，所以在实际开发中参与面向对象
 * 开发是不可以的，对此出现了包装类。让基本类型可以以对象形式存在。
 * @author Administrator
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		int d=128;
		/**
		 * 推荐使用静态方法valueOf形式创建包装类
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
		
		//获取int的取值范围
		System.out.println("int的取值范围");
		int imax=Integer.MAX_VALUE;
		System.out.println(imax);
		int imin=Integer.MIN_VALUE;
		System.out.println(imin);
		
		System.out.println("long的取值范围");
		long lmax=Long.MAX_VALUE;
		System.out.println(lmax);
		long lmin=Long.MIN_VALUE;
		System.out.println(lmin);
		
		System.out.println("double的取值范围");
		double dmax=Double.MAX_VALUE;
		System.out.println(dmax);
		double dmin=Double.MIN_VALUE;
		System.err.println(dmin);
		
		System.out.println("float的取值范围");
		float fmax=Float.MAX_VALUE;
		System.out.println(fmax);
		float fmin=Float.MIN_VALUE;
		System.out.println(fmin);
		
		System.out.println("short的取值范围");
		short smax=Short.MAX_VALUE;
		System.out.println(smax);
		short smin=Short.MIN_VALUE;
		System.out.println(smin);
		
		System.out.println("byte的取值范围");
		byte bmax=Byte.MAX_VALUE;
		System.out.println(bmax);
		byte bmin=Byte.MIN_VALUE;
		System.out.println(bmin);
		
		System.out.println("char的取值范围");
		char cmax=Character.MAX_VALUE;
		System.out.println(cmax);
		char cmin=Character.MIN_VALUE;
		System.out.println(cmin);
		
	}
}
