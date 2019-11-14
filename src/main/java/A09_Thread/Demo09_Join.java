package A09_Thread;

/**
 * void join()
 * jion����ʱ����Э���߳�֮��ͬ�����еġ�
 * ͬ�����У�ִ�����Ⱥ�˳��
 * �첽���У����ɸ���
 * @author Administrator
 * join����������ø÷������̵߳ȴ��÷��������̣߳�ֱ�����������߳�
 * ������Ϻ��ʹ���÷������̼߳�������������
 * �ȴ��Ĺ��̾��ǽ���������״̬��
 */
public class Demo09_Join {
	//��ʾͼƬ�Ƿ��������
	private static boolean isFinish=false;
	public static void main(String[] args) {
		/**
		 * JDK8֮ǰ����һ��ǿ��Ҫ��
		 * ��һ�������ľֲ��ڲ�������������������������ֲ�����ʱ���ñ�����������Ϊfinal��
		 * ��ʵ��������ΪJVM�ڴ�������⵼�µ�
		 */
		final Thread download=new Thread(){
			public void run(){
				System.out.println("down����ʼ����ͼƬ");
				for(int i=1;i<=100;i++){
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:ͼƬ������ϣ�");
				isFinish=true;
			}
		};
		Thread show=new Thread(){
			public void run(){
				try {
					System.out.println("show:��ʼ��ʾ����");
					Thread.sleep(1500);
					System.out.println("show:������ʾ���");
					//��ʾ�����ֺ�������ȴ������߳̽�ͼƬ����
					download.join();
					System.out.println("show:��ʼ��ʾͼƬ");
					if(!isFinish){
						throw new RuntimeException("ͼƬ����ʧ��");
					}
					System.out.println("show��ͼƬ��ʾ���");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		download.start();
		show.start();
	}
}
