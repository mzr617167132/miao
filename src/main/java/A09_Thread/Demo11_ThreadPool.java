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
public class Demo11_ThreadPool {
	public static void main(String[] args) {
		//����һ���̳߳أ�����������ͬʱ����ִ��2���߳�
		ExecutorService threadPool
		=Executors.newFixedThreadPool(3);
		//ExecutorService pool ���̳߳ص�����
		for(int i=0;i<5;i++){
			Runnable runn=new Runnable() {
				public void run() {
					try {
						Thread t=Thread.currentThread();
						System.out.println(t.getName()+"�����������񡣡���");
						Thread.sleep(5000);
						System.out.println(t.getName()+"�������");
					} catch (Exception e) {
					}
				}
			};
			System.out.println("������һ�����񣬲��������̳߳�");
			threadPool.execute(runn);
		}
		threadPool.shutdown();
		System.out.println("�̳߳�ֹͣ��");
	}
}

