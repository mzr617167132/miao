package A02_String;
/**
 * java�ṩ��һ�����صľ�̬������valueOf
 * �����ǽ���������ת��ΪString�����õ��ǽ���������ת��Ϊ�ַ���
 * @author MC
 *
 */
public class Demo10_ValueOf {
	public static void main(String[] args) {
		int d=123;
		String s1=String.valueOf(d);
		System.out.println(s1);
		s1=d+"";
		System.out.println(s1);
	}
}
