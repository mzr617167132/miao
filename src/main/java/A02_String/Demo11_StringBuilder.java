package A02_String;
/**
 * java.lang.StringBuilder
 * �����޸��ַ�����API
 * 
 * String���Ż���ƴ�����������ֻ�ʺ����ã����ʺ�Ƶ���޸ģ�
 * ���ԣ������޸��ַ������ݵ���ز���ʱӦ��ʹ��StringBuilder���곡��
 * 
 * ����ɾ���ģ�����
 * @author MC
 *
 */
public class Demo11_StringBuilder {
	public static void main(String[] args) {
		//Ĭ�ϱ�ʾһ�����ַ���: ""
		StringBuilder nothing=new StringBuilder();
		/**
StringBuilder		 * 
		 */
		String str="�ú�ѧϰjava";
		StringBuilder builder=new StringBuilder(str);
		/**
		 * �ú�ѧϰjava
append() * �ú�ѧϰjava,Ϊ���Ҹ��ù�����
��		 */
		builder.append("��Ϊ���Ҹ��ù�����");
		//��ȡStringBuider�ڲ��ĺ���ַ���
		str=builder.toString();
		System.out.println(str);
		/**
		 * �ú�ѧϰjava,Ϊ���Ҹ��ù�����
replace()* �ú�ѧϰjava,����Ϊ�˸ı����磡
��,�滻	 */
		builder.replace(9, 16, "����Ϊ�˸ı�����");
		System.out.println(builder.toString());
		/**
		 * �ú�ѧϰjava,����Ϊ�˸ı����磡
delete() * ,����Ϊ�˸ı����磡
ɾ		 */
		builder.delete(0, 8);
		System.out.println(builder.toString());
		/**
		 * ,����Ϊ�˸ı����磡
insert() * ����,����Ϊ�˸ı����磡
����		 */
		builder.insert(0, "����");
		System.out.println(builder.toString());	
	}
}
