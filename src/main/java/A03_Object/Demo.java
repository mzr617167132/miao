package A03_Object;
/**
 * ����Object��toString��equals
 * @author Administrator
 *
 */
public class Demo {

	public static void main(String[] args) {
		Point p=new Point(1,2);
		/**
		 * Object�ṩ��toString�������ص��ַ���Ϊ��
		 * ����ľ��
		 * ��ʽ��
		 * ����@��ַ
		 * �÷���ʵ�ʿ������岻�������Ҫʹ�����������ͨ�����Ǿ�Ҫ��д��
		 * ע��
		 * java�ṩ��������϶���д�˸÷�����ֻ�������Լ��������Ҫ������д��
		 * 
		 * toString����ʵ�ʿ��������Ǻ���ֱ�ӵ��ã�������ʹ��APIʱ������
		 * ���ǵ��á�
		 */
		String str=p.toString();
		System.out.println(str);
		/**
		 * System.out.println��Object o��
		 * �÷������ǽ���������toString�������ص��ַ������������̨��
		 */
		System.out.println(p);  //ֱ�ӵ�����toString
		/**
		 * �ַ���������������ʱ��Ҳ���ȵ��øö����toString������������
		 * ���ַ����������ӡ�
		 */
		str="point:"+p;       
		System.out.println(str);
		
		
		Point p2=new Point(1,2);
		System.out.println(p==p2);          //false
		System.out.println(p.equals(p2));  //true
		
		
		
		
		
		
		
		
		
		
	}

}
