package A09_Thread;
/**
 * �߳��ṩ��һ����̬������
 * static void sleep��long ms��
 * �÷������������и÷������̴߳�������״ָ̬�����룬��ʱ���̻߳��Զ��ص�RUNNABLE
 * ״̬�ȴ��ٴβ������С�
 * @author Administrator
 *
 */
public class Demo07_Sleep {

	public static void main(String[] args) {
		/**
		 * ����һ�����֣��Ӹ����ֿ�ʼÿ��ݼ������
		 * ������Ϊ0ʱ�����ʱ�䵽��
		 */
		
		for(int i=5;i>0;i--){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("ʱ�䵽");
		
	}
}
