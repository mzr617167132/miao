package A02_String;
/**
 * java.lang.StringBuilder
 * 用于修改字符串的API
 * 
 * String的优化设计带来的问题是只适合重用，不适合频繁修改，
 * 所以，若有修改字符串内容的相关操作时应当使用StringBuilder来完场。
 * 
 * 增，删，改，插入
 * @author MC
 *
 */
public class Demo11_StringBuilder {
	public static void main(String[] args) {
		//默认表示一个空字符串: ""
		StringBuilder nothing=new StringBuilder();
		/**
StringBuilder		 * 
		 */
		String str="好好学习java";
		StringBuilder builder=new StringBuilder(str);
		/**
		 * 好好学习java
append() * 好好学习java,为了找个好工作！
增		 */
		builder.append("，为了找个好工作！");
		//获取StringBuider内部改后的字符串
		str=builder.toString();
		System.out.println(str);
		/**
		 * 好好学习java,为了找个好工作！
replace()* 好好学习java,就是为了改变世界！
改,替换	 */
		builder.replace(9, 16, "就是为了改变世界");
		System.out.println(builder.toString());
		/**
		 * 好好学习java,就是为了改变世界！
delete() * ,就是为了改变世界！
删		 */
		builder.delete(0, 8);
		System.out.println(builder.toString());
		/**
		 * ,就是为了改变世界！
insert() * 活着,就是为了改变世界！
插入		 */
		builder.insert(0, "活着");
		System.out.println(builder.toString());	
	}
}
