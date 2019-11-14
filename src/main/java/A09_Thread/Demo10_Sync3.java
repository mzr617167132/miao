package A09_Thread;
/**
 * 静态方法若使用synchronized修饰后，那么该方法一定具有同步效果。
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
			System.out.println(t.getName()+":正在运行dosome");
			Thread.sleep(5000);
			System.out.println(t.getName()+":运行dosome");
		} catch (Exception e) {
		}
	}
}