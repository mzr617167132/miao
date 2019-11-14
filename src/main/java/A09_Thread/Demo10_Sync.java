package A09_Thread;
/**
 * ���̲߳�����ȫ����
 * ������̲߳�������ͬһ�ٽ���Դʱ�������߳��л�ʱ����ȷ�����²�������ִ��˳�����
 * ������߼����ң����ؿ��ܵ���ϵͳ̱����
 * @author M.C
 *
 */
public class Demo10_Sync {

	public static void main(String[] args) {
		Table table=new Table();
		Thread t1=new Thread(){
			public void run(){
				while(true){
					int bean=table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				while(true){
					int bean=table.getBean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}

}
class Table{
	private int beans=20;
	/**
	 * ��һ��������synchronized���κ���ô���������Ϊ��ͬ��������
	 * ��������̲߳���ͬʱִ�з����ڲ������ֽ�����̲߳������и�Ϊ������Ⱥ����з�����
	 * ������Ч�Ľ��������ȫ����
	 * ���ǽ����ɸ��ĸı��Ϊ�Ŷ�ִ�С�
	 * @return
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("û�ж�����");
		}
		Thread.yield();//ģ��cpuʱ��Ƭ�����ˣ������л�
		return beans--;
	}
}
