package A09_Thread;
/**
 * �߳����ȼ�
 * �߳�����������뵽�̵߳�������ͳһ�����߳�ֻ�ܱ����ı�����ʱ��Ƭ����������
 * ���ں�ʱ��ȡʱ��Ƭ���Լ�ʱ��Ƭ������ĸ��̶߳������̵߳�����������
 * �̵߳���������ʱ��Ƭ������ȫ���ȵ�'һ��һ�Ρ�˳����䣬��������������
 * ÿ���̻߳�ȡʱ��Ƭ�ĸ�����һ�µ�
 * 
 * �޸��̵߳����ȼ��������̶ȵĸ����̵߳���������ʱ��Ƭ�ĸ��ʣ������ϣ�
 * �߳����ȼ�Խ�ߵ��̻߳�ȡʱ��Ƭ�Ĵ���Խ��
 * @author Administrator
 *
 */
public class Demo06_Priority {

	public static void main(String[] args) {
		Thread max=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("max");
				}
			}
		};
		Thread min=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("min");
				}
			}
		};
		Thread norm=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("norm");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		
		min.start();
		max.start();
		norm.start();
	}

}
