package A09_Thread;
/**
 * �������ڲ�������̵߳����ִ�����ʽ
 * @author Administrator
 *
 */
public class Demo03_Thread {

	public static void main(String[] args) {
		Thread t1=new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭��");
				}
			}
		};
		
		Runnable r2=new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++){
					System.out.println("��ˮ��ģ�");
				}
			}
		};
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		
	}

}
