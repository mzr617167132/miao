package A09_Thread;
/**
 * 当一个线程正在处于阻塞状态时，若被其他线程调用中断方法
 * 试图中断时就会抛出中断异常，并结束阻塞状态。注意，此时线程
 * 并没有真的被中断，只是打断了睡眠阻塞。
 * @author Administrator
 *
 */
public class Demo07_Sleep2 {

	public static void main(String[] args) {
		Thread lin=new Thread(){
			public void run(){
				System.out.println("林：刚美容完~睡一睡~");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("林：干嘛呢！干嘛呢！");
				}
				System.out.println("林：醒了");
			}
		};
		
		Thread huang=new Thread(){
			public void run(){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println("黄：开始砸墙了！");
				for(int i=0;i<5;i++){
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println("80！");
					
				}
				System.out.println("哐当！");
				System.out.println("黄：搞定！");
				//中断lin线程的睡眠阻塞
				lin.interrupt();
			}
		};
		lin.start();
		huang.start();
	}

}
