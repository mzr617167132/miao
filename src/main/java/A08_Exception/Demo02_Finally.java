package A08_Exception;
/**
 * finally�����쳣������������һ��
 * ������ֱ�Ӹ���try֮��������һ��catch֮��
 * finally���Ա�ֻ֤Ҫ����ִ�е�try�����У���ô����try��
 * �Ĵ����Ƿ��׳��쳣��finally���еĴ��붼�ض�ִ�С�
 * 
 * ��������ͨ�������غ����򱣴����Ҫִ�еĴ���������У�
 * ����IO������ϵ����رա�
 * @author Administrator
 *
 */
public class Demo02_Finally {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str="";
			System.out.println(str.length());
			return;
		} catch (Exception e) {
			System.out.println("�����ˣ�");
		}finally{
			System.out.println("finally����ִ����");
		}
		System.out.println("���������");
	}

}
