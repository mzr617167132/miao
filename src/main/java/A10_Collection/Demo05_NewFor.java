package A10_Collection;
/**
 * JDK5֮���Ƴ���һ�����ԣ�
 * ��ǿforѭ����Ҳ��Ϊ����ѭ����for each
 * ��ѭ����ȡ����ͳforѭ���Ĺ�������ֻ�����������ϻ�����
 * @author M.C.
 *
 */
public class Demo05_NewFor {

	public static void main(String[] args) {
		String []arr={"1","2","3","4"};
		for(int i=0;i<arr.length;i++){
			String str=arr[i];
			System.out.println(str);
		}
		/*
		 * ��ѭ���Ǳ������Ͽɵģ������������
		 * ����������ʱ�Ὣ��ѭ�����������Ϊ��ͨforѭ������
		 */
		for(String str:arr){
			System.out.println(str);
		}
		
	}

}
