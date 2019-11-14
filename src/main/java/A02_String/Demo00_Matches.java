package A02_String;
/**
 * 1.检查邮箱
 * 2.获取网址中的域名
 * @author MC
 *
 */
/*
 * 字符串支持正则表达式方法一：
 * boolean matche（String regex）
 * 使用给定的正则表达式验证当前字符串是否符合格式要求
 * 符合则返回true
 * 注意，给定的正则表达式无论是否添加了边界匹配符（^...$)
 * 都是做完全匹配的
 */
/*
 * 2.字符集合，数量词
 * [abc]        //a,b,c中任意一个字符
 * [^abc]       //除了a,b,c的任意字符 
 * [a-z]        //a,b,....z中的任意一个字符
 * [a-zA-Z0-9]  //a~z，A~Z，0~9中的任意一个字符 
 * [a-z&&[^bc]]
 * .      //任意一个字符   
 * \d     //任意一个数字字符，相当于[0-9]
 * \w     //单词字符，相当于[a-zA-Z0-9]
 * \s     //空白字符，相当于[\t\n\x0B\f\r]
 * \D     //非数字字符
 * \W     //非单词字符
 * \S     //非空白字符
 *数量词
 * [X]?     //表示0个或1个X
 * [X]*     //表示0个或任意多个X 
 * [X]+     //表示1个到任意多个X（大于等于1）
 * [X]{n}   //表示n个X
 * [X]{n,}  //表示n个到任意多个X（大于等于n个X），至少
 * [X]{n,m} //表示n个到m个X，至多
 * 
 * 分组() 表示分组，可以将一系列正则表达式看做一个整体，
 * |  分组时可以用|来表示或
 * 
 * 边界匹配
 * ^代表字符串开始       ^[abc]{3}  aacfffff
 * $代表字符串结束      [abc]{3}$  fffffaac
 * 全匹配  ^[abc]$
 */
public class Demo00_Matches {
	public static void main(String[] args) {
		String mail="fancq@t.com";
		boolean match=checkEmail(mail);
		if(match){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}
		System.out.println("----------");
		String name=getDomain("www.baidu.com");
		System.out.println(name);
	}
	/**
	 * 检查是否邮箱
	 * @param email
	 * @return true-是邮箱，false-不是邮箱
	 */
	public static boolean checkEmail(String email) {
		/**
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		return email.matches(regex);
	}
	/**
	 * 获取网址域名
	 * @param host 网址
	 * @return 返回域名
	 */
	public static String getDomain(String host){
		int start=host.indexOf(".")+1;
		int end=host.indexOf(".",start);
		return host.substring(start,end);
	}
	
}
