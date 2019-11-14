package A09_Thread;
/**
 * 互斥锁
 * 当synchronized修饰多个代码片段，而这些同步块指定的同步监视器对象
 * 是同一个时，这些代码片段就是互斥的，多个线程不能同时在这些代码片段中执行。
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
			System.out.println(t.getName()+"：正在运行A方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+":运行A方法完毕");
		} catch (Exception e) {
		}
	}
	public synchronized void methodB(){
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+"：正在运行B方法");
			Thread.sleep(5000);
			System.out.println(t.getName()+":运行B方法完毕");
		} catch (Exception e) {
		}
	}
}
