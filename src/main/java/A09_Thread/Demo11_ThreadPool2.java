package A09_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳����ڹ����̣߳���Ҫ�����������������
 * 1�������߳�����
 * 2�������߳�
 * @author Administrator
 *
 */
public class Demo11_ThreadPool2 {
	public static void main(String[] args) {
		//����һ���̳߳أ�����������ͬʱ����ִ��2���߳�
		ExecutorService threadPool
		=Executors.newFixedThreadPool(3);
		//ExecutorService pool ���̳߳ص�����
		
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
