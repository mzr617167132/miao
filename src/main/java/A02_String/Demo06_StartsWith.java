package A02_String;
/**
 * boolean startsWith��String str��
 * boolean endsWith��String str��
 * �жϵ�ǰ�ַ����Ƿ����Ը����ַ�����ʼ���β��
 * @author MC
 *
 */
public class Demo06_StartsWith {
	public static void main(String[] args) {
		String line="thinking in java";
		boolean starts=line.startsWith("th");
		System.out.println("starts:"+starts);
		boolean ends=line.endsWith("ava");
		System.out.println("ends:"+ends);
	
	}
}
