package A02_String;

import java.util.Arrays;
/**
 * String[] split(String regex)
 * ����ַ������������ַ�����������������ʽҪ��Ĳ��ֽ��в�֣�
 * Ȼ�󽫲�ֵĸ�������һ���ַ���������ʽ����
 * @author MC
 *
 */
public class Demo04_Split {
	public static void main(String[] args) {
		String str="abc123def456ghi";
		
		String[]array=str.split("[0-9]+");
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
	
	}
}
