package A09_Thread;
/**
 * �ػ��߳�
 * �߳�Ĭ�ϴ���Ϊ��ͨ�̣߳���һ�������е�������ͨ�̶߳�����ʱ�����̾ͻ������
 * ��ʱ�����������е��ػ��̶߳��ᱻǿ�ƽ�����
 * �ػ��߳�Ҳ�к�̨�߳�
 * @author Administrator
 *
 */
public class Demo08_DaemonThread {

	public static void main(String[] args) {
		Thread rose=new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("rose:������������AAAAAAaaaaa");
				System.out.println("��ͨ");
			}
		};
		
		Thread jack=new Thread(){
			public void run(){
				while(true){
					System.out.println("u jump,i jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}		
				}
			}
		};
		//�����ػ��̱߳������߳�����ǰ����
		jack.setDaemon(true);
		rose.start();
		jack.start();
		System.out.println("mian is ending");
		
	}

}
