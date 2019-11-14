package A02_String;
/**
 * boolean startsWith（String str）
 * boolean endsWith（String str）
 * 判断当前字符串是否是以给定字符串开始或结尾的
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
