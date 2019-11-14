package A09_Thread;
/**
 * 守护线程
 * 线程默认创建为普通线程，当一个进程中的所有普通线程都结束时，进程就会结束。
 * 这时所有正在运行的守护线程都会被强制结束。
 * 守护线程也叫后台线程
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
				System.out.println("rose:啊啊啊啊啊啊AAAAAAaaaaa");
				System.out.println("噗通");
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
		//设置守护线程必须在线程启动前进行
		jack.setDaemon(true);
		rose.start();
		jack.start();
		System.out.println("mian is ending");
		
	}

}
