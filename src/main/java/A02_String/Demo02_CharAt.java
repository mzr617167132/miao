package A02_String;

/**
 * char charAt(int index) 
 * ��ȡ��ǰ�ַ�����ָ��λ���ϵ��ַ�
 * 
 * @author MC
 *
 */
public class Demo02_CharAt {
	public static void main(String[] args) {
		// 0123456789012345
		String str = "thinking in java";
		char c = str.charAt(9);
		System.out.println(c);
		/*
		 * ������ �Ϻ�����ˮ���Ժ���
		 */
		String line = "�Ϻ�����ˮ���Ժ���";
		for (int i = 0; i < line.length() / 2; i++) {
			if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
				System.out.print("��");
				break;
			}
		}
		System.out.println("�ǻ��ģ�");
	}
}
