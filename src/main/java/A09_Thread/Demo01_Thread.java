package A09_Thread;
/**
 * ���߳�
 * ���̵߳���������ִ�д���ķ�ʽ��ԭ�еĴ��ϵ���һ��һ������ִ��
 * ��Ϊ��δ��롰ͬʱ�����еķ�ʽ��
 * �����Ӵ���ִ�и�Ϊ����ִ��
 *
 * �߳������ִ�����ʽ
 * ��ʽһ��
 * ����һ���࣬�̳�ThreadȻ����д��run�������������ж�����߳�Ҫִ�еĴ��롣
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
 * ��һ�ִ����̵߳ķ�ʽ�����������ȱ�㣺
 * 1������java�ǵ��̳еģ��⵼���������̳���Thread�Ͳ����ټ̳������������÷����ˣ�
 * ����ʵ�ʿ����зǳ�����
 * 2��������дrun���������߳������⵼�½�����ֱ�Ӷ������̵߳��У�ʹ���߳����������һ����Ȼ
 * ��Ϲ�ϵ���������̵߳����á�
 * @author Administrator
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭����");
		}
		
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("���ǲ�ˮ��ģ�");
		}
	}
}