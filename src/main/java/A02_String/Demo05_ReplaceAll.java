package A02_String;
/**
 * 字符串支持正则表达式方法三：
 * String replaceAll（String regex，String str）
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 * @author MC
 *
 */
public class Demo05_ReplaceAll {
	public static void main(String[] args) {
		String str="abc123def456ghi";
		/**
		 * 将数字部分替换为“#NUMBER#”
		 */
		str=str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}
}
