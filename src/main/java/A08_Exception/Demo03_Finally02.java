package A08_Exception;
/**
 * final,finally,finalize
 * final�ؼ��֣������࣬����������
 * finally �쳣�������һ�����ߵĳ���
 * finalize Object�еı�Ҫ���������ж����ڱ�GC����ʱ�������õķ���
 * @author Administrator
 *
 */
public class Demo03_Finally02 {

	public static void main(String[] args) {
		System.out.println(
			test("0")+","+test(null)+","+test("")
		);
	}

	public static int test(String str){
		System.out.println("test����ִ���ˣ�����Ϊ��"+str);
		try {
			return str.charAt(0)-'0';
		} catch (NullPointerException e) {
			System.out.println("�����˿�ָ��");
			return 1;
		}catch(Exception e){
			System.out.println("�����������쳣");
			return 2;
		}finally{
			System.out.println("finallyִ����");
			return 3;
		}
	}
	
	
}
