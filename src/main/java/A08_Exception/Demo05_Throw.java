package A08_Exception;
/**
 * �쳣���׳�
 * @author Administrator
 *
 */
public class Demo05_Throw {

	public static void main(String[] args) {
		System.out.println("����ʼ��");
		
		Person p=new Person();   
		try {
			/**
			 * �����ǵ���һ������ŷthrows�����쳣�׳��ķ���ʱ��
			 * ������Ҫ�����Ǳ��봦����쳣����������ֶ������֣�
			 * 1��ʹ��try-catch�������񲢴���
			 * 2���ڵ�ǰ�����ϼ���ʹ��throws�������쳣���׳�
			 * ����ʹ�����ֽ���ֶ�Ҫ���ʵ�ʿ�������
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
			System.out.println("message:"+e.getMessage());
		}
		System.out.println("���䣺"+p.getAge());
		
		
		System.out.println("���������");
	}

}
