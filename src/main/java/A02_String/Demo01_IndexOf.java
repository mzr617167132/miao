package A02_String;
/**
 * int indexOf(String str)
 * 在当前字符串中查找给定字符串所在的位置，若当前字符串不含有给定
 * 内容则返回值为-1。
 * 
 */
public class Demo01_IndexOf {
	public static void main(String[] args) {
		//          0123456789012345   
		String str="thinking in java";
		int index=str.indexOf("in");
		System.out.println("index:"+index);//2
		
		index=str.indexOf("in",3);//5,从3位置开始找
		index=str.lastIndexOf("in");//9，最后位置

	}
}
