package A09_Thread;
/**
 * �߳���һ����̬�ķ�����
 * static Thread currentThread����
 * �÷������ȡ��������������߳�
 * 
 * API��ThreadLocal���Դ���ʵ����ع��ܡ�
 * @author Administrator
 *
 */
public class Demo04_CurrentThread {

	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		System.out.println("����main�������߳��ǣ�"+main);
		dosome();
		Thread t=new Thread(){
			public void run(){
				Thread t=Thread.currentThread();
				System.out.println("�Զ����̣߳�"+t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println("����dosome�������߳��ǣ�"+t);
	}

}
