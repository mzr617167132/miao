package A01_apidoc;

/**
 * �ĵ�ע�� �ĵ�ע��ֻ����˵�������ط��� 
 * �࣬���������� 
 * ���ǹ��ܼ�ע�ͣ���˵���������ܵģ�������ĳһ���������塣
 * ������ʹ�ã�ͨ������˵����ǰ��������ͼ�Լ����ܽ��ܡ�
 * 
 * @author MC
 * @version �汾:1.0 2018/12/25
 * @see �μ�:java.lang.String
 * @since ʼ��JDK�汾:JDK1.0
 */
public class DocDemo {
	/**
	 * sayHello�����е��ʺ���
	 */
	public static final String INFO = "��ã�";

	/**
	 * �Ը������û�����ʺ���
	 * 
	 * @param name �û�����
	 * @return �����ʺ�����ַ���
	 */
	public String sayHello(String name) {
		return "��ã�" + name;
	}
}
