package A09_Thread;
/**
 * ��һ���߳����ڴ�������״̬ʱ�����������̵߳����жϷ���
 * ��ͼ�ж�ʱ�ͻ��׳��ж��쳣������������״̬��ע�⣬��ʱ�߳�
 * ��û����ı��жϣ�ֻ�Ǵ����˯��������
 * @author Administrator
 *
 */
public class Demo07_Sleep2 {

	public static void main(String[] args) {
		Thread lin=new Thread(){
			public void run(){
				System.out.println("�֣���������~˯һ˯~");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("�֣������أ������أ�");
				}
				System.out.println("�֣�����");
			}
		};
		
		Thread huang=new Thread(){
			public void run(){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println("�ƣ���ʼ��ǽ�ˣ�");
				for(int i=0;i<5;i++){
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println("80��");
					
				}
				System.out.println("�ѵ���");
				System.out.println("�ƣ��㶨��");
				//�ж�lin�̵߳�˯������
				lin.interrupt();
			}
		};
		lin.start();
		huang.start();
	}

}
