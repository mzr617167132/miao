package A02_String;
/**
 * �ַ���֧��������ʽ��������
 * String replaceAll��String regex��String str��
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ��������
 * @author MC
 *
 */
public class Demo05_ReplaceAll {
	public static void main(String[] args) {
		String str="abc123def456ghi";
		/**
		 * �����ֲ����滻Ϊ��#NUMBER#��
		 */
		str=str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}
}
