package A02_String;
/**
 * String substring(int start,int end)
 * ��ȡ��ǰ�ַ�����ָ����Χ�ڵ��ַ�����start��endʱ�����±ꡣ
 * ��ʾ�������ȡ������
 * ע�⣺java API��һ���ص㣬ͨ�����������ֱ�ʾ��Χʱ
 * ���ǡ���ͷ����β��������������ʼλ�ö�Ӧ���ݣ����ǲ���������λ�ö�Ӧ���ݡ�
 * @author MC
 *
 */
public class Demo03_Substring {
	public static void main(String[] args) {
		//           01234567890
		String host="www.tedu.cn";
		
		String name=host.substring(4,8);
		System.out.println(name);
		
		name=host.substring(4);
		System.out.println(name);
	}
}
