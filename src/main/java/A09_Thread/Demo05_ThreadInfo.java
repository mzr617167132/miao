package A09_Thread;
/**
 * ��ȡ�߳������Ϣ�ķ���
 * @author Administrator
 *
 */
public class Demo05_ThreadInfo {

	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		//��ȡ�̵߳�Ψһ��ʶ
		long id=main.getId();
		System.out.println("id:"+id);
		
		//��ȡ����
		String name=main.getName();
		System.out.println("name:"+name);
		
		//��ȡ���ȼ�
		int priority=main.getPriority();
		System.out.println("���ȼ�:"+priority);
		
		boolean isAlive=main.isAlive();
		System.out.println("�Ƿ��ڻ״̬��"+isAlive);
		boolean isDeamon=main.isDaemon();
		System.out.println("�Ƿ�Ϊ�ػ��̣߳�"+isDeamon);
		boolean isInter=main.isInterrupted();
		System.out.println("�Ƿ��жϣ�"+isInter);
	}

}
