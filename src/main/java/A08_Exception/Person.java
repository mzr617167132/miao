package A08_Exception;

/**
 * ʹ��������������쳣���׳�
 * @author Administrator
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}
	/**
	 * throw�ؼ������������׳�һ������
	 * throws��������������ͬʱ�����÷��������׳����쳣��
	 * ����������������ø÷����Ĵ���Ƭ����û�д�����쳣
	 * û�д�������벻ͨ������ʾǿ�ƴ���
	 * ����RuntimeException֮�⣬�������͵��쳣��
	 * �׳�ʱ��������Ҫ����봦��
	 * @param age
	 * @throws Exception
	 */
	public void setAge(int age) throws IllegalAgeException {
		if(age>100||age<0){
			throw new IllegalAgeException("���䲻�Ϸ�");
//			throw new RuntimeException("���䲻�Ϸ�");
		}
		this.age = age;
	}
}
