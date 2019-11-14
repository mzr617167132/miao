package A09_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池用于管理线程，主要解决的问题有两个：
 * 1：控制线程数量
 * 2：重用线程
 * @author Administrator
 *
 */
public class Demo11_ThreadPool {
	public static void main(String[] args) {
		//创建一个线程池，其中最多可以同时并发执行2个线程
		ExecutorService threadPool
		=Executors.newFixedThreadPool(3);
		//ExecutorService pool 是线程池的引用
		for(int i=0;i<5;i++){
			Runnable runn=new Runnable() {
				public void run() {
					try {
						Thread t=Thread.currentThread();
						System.out.println(t.getName()+"正在运行任务。。。");
						Thread.sleep(5000);
						System.out.println(t.getName()+"任务完成");
					} catch (Exception e) {
					}
				}
			};
			System.out.println("创建了一个任务，并交给了线程池");
			threadPool.execute(runn);
		}
		threadPool.shutdown();
		System.out.println("线程池停止了");
	}
}

