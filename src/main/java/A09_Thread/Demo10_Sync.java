package A09_Thread;
/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源时，由于线程切换时机不确定导致操作代码执行顺序混乱
 * 会出现逻辑混乱，严重可能导致系统瘫痪。
 * @author M.C
 *
 */
public class Demo10_Sync {

	public static void main(String[] args) {
		Table table=new Table();
		Thread t1=new Thread(){
			public void run(){
				while(true){
					int bean=table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				while(true){
					int bean=table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}

}
class Table{
	private int beans=20;
	/**
	 * 当一个方法被synchronized修饰后，那么这个方法称为“同步方法”
	 * 即：多个线程不能同时执行方法内部，这种将多个线程并发运行改为有序的先后运行方法，
	 * 可以有效的解决并发安全问题
	 * 就是将各干各的改变变为排队执行。
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了");
		}
		Thread.yield();//模拟cpu时间片用完了，发生切换
		return beans--;
	}
}
