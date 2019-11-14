package A09_Thread;

/**
 * 同步块
 * synchronized（同步监视器对象）{
 * 	需要同步运行的代码片段
 * }
 * 同步块可以更准确的控制需要同步运行的代码片段，有效的缩小
 * 同步范围可以在保证并发安全的前提下尽可能提高并发的效率
 * @author M.C.
 *
 */
public class Demo10_Sync2 {

	public static void main(String[] args) {
		final Shop shop=new Shop();
		Thread t1=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}

}
class Shop{
	/**
	 * 成员方法上若直接使用synchronized修饰，那么同步监视器对象无需指定
	 * 使用的就是该方法所属对象，即：方法中看到的this
	 */
//	public synchronized void buy(){
	public  void buy(){
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+"：正在选衣服");
			Thread.sleep(5000);
			//试衣服环节模拟会出现并发安全问题
			/**
			 * 多个线程要想在同步块这里同步执行代码，必须保证这里指定的同步
			 * 监视器对象（上锁的对象)是【同一个】	
			 * 
			 */
			synchronized (this) {//this指shop对象
				System.out.println(t.getName()+":正在试衣服");
				Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+":结账离开");
		} catch (Exception e) {
		}
	}
}