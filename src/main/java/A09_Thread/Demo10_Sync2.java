package A09_Thread;

/**
 * ͬ����
 * synchronized��ͬ������������{
 * 	��Ҫͬ�����еĴ���Ƭ��
 * }
 * ͬ������Ը�׼ȷ�Ŀ�����Ҫͬ�����еĴ���Ƭ�Σ���Ч����С
 * ͬ����Χ�����ڱ�֤������ȫ��ǰ���¾�������߲�����Ч��
 * @author M.C.
 *
 */
public class Demo10_Sync2 {

	public static void main(String[] args) {
		final Shop shop=new Shop();
		Thread t1=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}

}
class Shop{
	/**
	 * ��Ա��������ֱ��ʹ��synchronized���Σ���ôͬ����������������ָ��
	 * ʹ�õľ��Ǹ÷����������󣬼��������п�����this
	 */
//	public synchronized void buy(){
	public  void buy(){
		Thread t=Thread.currentThread();
		try {
			System.out.println(t.getName()+"������ѡ�·�");
			Thread.sleep(5000);
			//���·�����ģ�����ֲ�����ȫ����
			/**
			 * ����߳�Ҫ����ͬ��������ͬ��ִ�д��룬���뱣֤����ָ����ͬ��
			 * ���������������Ķ���)�ǡ�ͬһ����	
			 * 
			 */
			synchronized (this) {//thisָshop����
				System.out.println(t.getName()+":�������·�");
				Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+":�����뿪");
		} catch (Exception e) {
		}
	}
}