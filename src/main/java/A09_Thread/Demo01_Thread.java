package A09_Thread;
/**
 * 多线程
 * 多线程得以让我们执行代码的方式从原有的从上到下一句一句有序执行
 * 改为多段代码“同时”运行的方式。
 * 即：从串联执行改为并发执行
 *
 * 线程有两种创建方式
 * 方式一：
 * 定义一个类，继承Thread然后重写其run方法，并在其中定义该线程要执行的代码。
 */
public class Demo01_Thread {

	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		
		t1.start();
		t2.start();

	}

	
}
/**
 * 第一种创建线程的方式存在两个设计缺点：
 * 1：由于java是单继承的，这导致我们若继承了Thread就不能再继承其他类来复用方法了，
 * 这在实际开发中非常不便
 * 2：我们重写run方法定义线程任务，这导致将任务直接定义在线程当中，使得线程与任务存在一个必然
 * 耦合关系，不利于线程的重用。
 * @author Administrator
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊？");
		}
		
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的！");
		}
	}
}