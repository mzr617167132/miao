package A02_String;
/**
 * 1.�������
 * 2.��ȡ��ַ�е�����
 * @author MC
 *
 */
/*
 * �ַ���֧��������ʽ����һ��
 * boolean matche��String regex��
 * ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ���ϸ�ʽҪ��
 * �����򷵻�true
 * ע�⣬������������ʽ�����Ƿ�����˱߽�ƥ�����^...$)
 * ��������ȫƥ���
 */
/*
 * 2.�ַ����ϣ�������
 * [abc]        //a,b,c������һ���ַ�
 * [^abc]       //����a,b,c�������ַ� 
 * [a-z]        //a,b,....z�е�����һ���ַ�
 * [a-zA-Z0-9]  //a~z��A~Z��0~9�е�����һ���ַ� 
 * [a-z&&[^bc]]
 * .      //����һ���ַ�   
 * \d     //����һ�������ַ����൱��[0-9]
 * \w     //�����ַ����൱��[a-zA-Z0-9]
 * \s     //�հ��ַ����൱��[\t\n\x0B\f\r]
 * \D     //�������ַ�
 * \W     //�ǵ����ַ�
 * \S     //�ǿհ��ַ�
 *������
 * [X]?     //��ʾ0����1��X
 * [X]*     //��ʾ0����������X 
 * [X]+     //��ʾ1����������X�����ڵ���1��
 * [X]{n}   //��ʾn��X
 * [X]{n,}  //��ʾn����������X�����ڵ���n��X��������
 * [X]{n,m} //��ʾn����m��X������
 * 
 * ����() ��ʾ���飬���Խ�һϵ��������ʽ����һ�����壬
 * |  ����ʱ������|����ʾ��
 * 
 * �߽�ƥ��
 * ^�����ַ�����ʼ       ^[abc]{3}  aacfffff
 * $�����ַ�������      [abc]{3}$  fffffaac
 * ȫƥ��  ^[abc]$
 */
public class Demo00_Matches {
	public static void main(String[] args) {
		String mail="fancq@t.com";
		boolean match=checkEmail(mail);
		if(match){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
		System.out.println("----------");
		String name=getDomain("www.baidu.com");
		System.out.println(name);
	}
	/**
	 * ����Ƿ�����
	 * @param email
	 * @return true-�����䣬false-��������
	 */
	public static boolean checkEmail(String email) {
		/**
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		return email.matches(regex);
	}
	/**
	 * ��ȡ��ַ����
	 * @param host ��ַ
	 * @return ��������
	 */
	public static String getDomain(String host){
		int start=host.indexOf(".")+1;
		int end=host.indexOf(".",start);
		return host.substring(start,end);
	}
	
}
