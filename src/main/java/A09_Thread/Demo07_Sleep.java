package A09_Thread;
/**
 * 线程提供了一个静态方法：
 * static void sleep（long ms）
 * 该方法可以让运行该方法的线程处于阻塞状态指定毫秒，超时后线程会自动回到RUNNABLE
 * 状态等待再次并发运行。
 * @author Administrator
 *
 */
public class Demo07_Sleep {

	public static void main(String[] args) {
		/**
		 * 输入一个数字，从该数字开始每秒递减并输出
		 * 当数字为0时输出：时间到！
		 */
		
		for(int i=5;i>0;i--){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("时间到");
		
	}
}
