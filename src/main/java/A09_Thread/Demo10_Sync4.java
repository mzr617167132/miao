package A09_Thread;
/**
 * ������
 * ��synchronized���ζ������Ƭ�Σ�����Щͬ����ָ����ͬ������������
 * ��ͬһ��ʱ����Щ����Ƭ�ξ��ǻ���ģ�����̲߳���ͬʱ����Щ����Ƭ����ִ�С�
 * @author M.C.
 *
 */
public class Demo10_Sync4 {
	
	public static void main(String[] args) {
		Foo foo=new Foo();
		Thread t1=new Thread(){
			public void run(){
				foo.methodA();
			
			}
		};
		Thread t2=new Thread(){
			public void run(){
				foo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
	
}
class Foo{
	public synchronized void methodA(){
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+"����������A����");
			Thread.sleep(5000);
			System.out.println(t.getName()+":����A�������");
		} catch (Exception e) {
		}
	}
	public synchronized void methodB(){
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+"����������B����");
			Thread.sleep(5000);
			System.out.println(t.getName()+":����B�������");
		} catch (Exception e) {
		}
	}
}
