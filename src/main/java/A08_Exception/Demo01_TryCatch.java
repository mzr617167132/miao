package A08_Exception;
/**
 * �쳣��������е�try-catch
 * �﷨���壺
 * try{
 * 	���ܳ����쳣�Ĵ���Ƭ��
 * }catch(XXXException){
 * 	��try���еĴ��������XXXException��Ĵ������
 * }
 * @author Administrator
 *
 */
public class Demo01_TryCatch {

	public static void main(String[] args) {
		System.out.println("����ʼ�ˣ�");
		try{
//			String str=null;
			/**
			 * �������ִ�е��������ʱ������ֿ�ָ�����⣬�����������ʵ����
			 * һ��NullPointerException
			 * ʵ�����ڱ�ʾ�쳣����������ִ�й������õ����쳣ʵ���б��������λ�ã�
			 * Ȼ���쳣�׳���
			 */
//			System.out.println(str.length());
			String str="";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			//ע��try�����б���������µ����ݶ���ִ��
			System.out.println("!!!!");
		}catch(NullPointerException e){
			System.out.println("�����˿�ָ��");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("�������±�Խ��");
			/**
			 * ���ǿ��������һ��catch�в���Exception��������Ϊһ��
			 * δ������쳣���³����жϡ�
			 */
		}catch(Exception e){
			System.out.println("�������˸���");
		}
		System.out.println("��������ˣ�");
	}
}
