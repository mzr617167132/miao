package A15_Lambda;
/**
 * lambda���ʽ
 * Jdk8֮���Ƴ���һ���µ�����
 * 
 * �﷨���壺
 * ([args..])->{
 * 	  ���������
 * }
 * 
 * lambda�����ø�����Ĵ��봴�������ڲ��࣬
 * ������һ��ǰ��������ʵ�ֵĽӿڱ�������ֻ����һ�����󷽷�
 * @author M.C.
 *
 */
public class Demo01_Lambda {

	public static void main(String[] args) {
		
		Runnable r1=new Runnable() {
			public void run() {
			}
		};
		   
		
		Runnable r2=()-> {
			System.out.println("hello");
			System.out.println("�������Ҫ��{}");
		};
		
		Runnable r3=()->System.out.println("һ��������ʡ��{}");

	}

}
