package A09_Thread;
/**
 * ��̬������ʹ��synchronized���κ���ô�÷���һ������ͬ��Ч����
 * 
 * @author M.C.
 *
 */
public class Demo10_Sync3 {
	public static void main(String[] args) {
		Thread t1=new Thread(){
			public void run(){
				Boo.dosome();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				Boo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}
class Boo{
	public static void dosome(){
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+":��������dosome");
			Thread.sleep(5000);
			System.out.println(t.getName()+":����dosome");
		} catch (Exception e) {
		}
	}
}