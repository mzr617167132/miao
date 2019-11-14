package A08_Exception;

import java.io.FileOutputStream;

/**
 * JDk7����ʱ��������һ���µ����ԣ��Զ��ر�
 * �������Ǳ������Ͽɵģ������������Ը����ķ�ʽ����IO�Ĺر�
 * @author Administrator
 *
 */
public class Demo04_AutoCloserable {

	public static void main(String[] args) {
		/**
		 * ���������ջὫ�����Ϊ��finally�йرա�
		 * עtry�������ж�������ݱ���ʵ����java.lang.AutoCloseable�ӿ�
		 * ������벻ͨ��
		 */
		try (
			FileOutputStream fos=new FileOutputStream("fos.dat");	
		){
			fos.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
