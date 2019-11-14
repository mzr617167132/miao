package A02_String;

/**
 * char charAt(int index) 
 * 获取当前字符串中指定位置上的字符
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
		 * 检测回文 上海自来水来自海上
		 */
		String line = "上海自来水来自海上";
		for (int i = 0; i < line.length() / 2; i++) {
			if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
				System.out.print("不");
				break;
			}
		}
		System.out.println("是回文！");
	}
}
