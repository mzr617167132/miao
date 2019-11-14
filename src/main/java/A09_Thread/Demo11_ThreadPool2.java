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
public class Demo11_ThreadPool2 {
	public static void main(String[] args) {
		//创建一个线程池，其中最多可以同时并发执行2个线程
		ExecutorService threadPool
		=Executors.newFixedThreadPool(3);
		//ExecutorService pool 是线程池的引用
		
		for(int i=0;i<10;i++){
			threadPool.execute(new Task(i));
		}
	}
}
class Task implements  Runnable{
	int i;
	public Task(int i){
		this.i=i;
	}
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(this.i+":"+t);
		
	}
}
