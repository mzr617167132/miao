package A02_String;
/**
 * �ַ����ǲ�����󣬼�������һ���������ݲ��ɸı䣬���ı�һ���ᴴ���¶���
 * java�Ƽ�����ʹ����������ʽ�����ַ�����������������������һ�����ַ���
 * �����������ڴ濪����
 * @author MC
 *
 */
public class Demo01_String {
	public static void main(String[] args) {
		//          ������  ֱ����
		String s1="123abc";
		String s2="123abc";
		String s3="123abc";
		//s2,s3������s1����
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//true
		//�޸����ݻᴴ���¶���
		s1=s1+"!";
		System.out.println(s1);//123abc!
		//s1�Ѿ�����ָ��ԭ����
		System.out.println(s1==s2);//false
		//��Ӱ��s2��s3����
		System.out.println(s2==s3);//true
		
		String s4=new String("123abc");
		System.out.println("s4:"+s4);
		System.out.println(s2==s4);//false
		/*
		 * ��������һ���Ż����������������ڱ���Դ����ʱ��������һ��������ʽ����
		 * ��ֵ����������ʱ�����������������ڱ�����ȷ��ʱ����ô��������ֱ�ӽ���
		 * ���㣬����������뵽�ֽ����ļ��У�������û�б�Ҫ�������ÿ������ʱ�ټ��㡣
		 * �������ᱻ��������Ϊ��
		 * String s5=��123abc����
		 */
		String s5="123"+"abc";
		System.out.println("s5:"+s5);
		System.out.println(s2==s5);//true
		
		String s="123";
		//����һ���Ǳ�����������������м��㡣
		String s6=s+"abc";
		System.out.println(s2=s6);//false
		
		String s7='1'+23+"abc";
		System.out.println(s7);
		System.out.println(s2==s7);//false
	
	}
}
