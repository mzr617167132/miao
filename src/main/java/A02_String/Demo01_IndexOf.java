package A02_String;
/**
 * int indexOf(String str)
 * �ڵ�ǰ�ַ����в��Ҹ����ַ������ڵ�λ�ã�����ǰ�ַ��������и���
 * �����򷵻�ֵΪ-1��
 * 
 */
public class Demo01_IndexOf {
	public static void main(String[] args) {
		//          0123456789012345   
		String str="thinking in java";
		int index=str.indexOf("in");
		System.out.println("index:"+index);//2
		
		index=str.indexOf("in",3);//5,��3λ�ÿ�ʼ��
		index=str.lastIndexOf("in");//9�����λ��

	}
}
