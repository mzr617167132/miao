package A07_IO;

import java.io.Serializable;
import java.util.Arrays;

/**
 * ʹ�õ�ǰ����Զ������Ķ����д����
 * 
 * Serializable�ӿ�û�ж����κη��������ǵ��������ڱ��뵱ǰԴ����ʱ����
 * ��ǰ��ʵ���˸ýӿ�ʱ�������������һ���������ڽ���ǰ��ʵ��ת��Ϊһ���ֽڡ�
 */
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private transient String []otherInfo;
	/**
	 * ��һ�����Ա��ؼ���transient���κ���ô��ǰʵ�������л�ʱ��������Ե�ֵ�ᱻ���ԡ�
	 * ���Բ���Ҫ�����Կ��Դﵽ�������л���������������ٲ���Ҫ����Դ������
	 */
	public Person(){
		
	}

	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String[] getOtherInfo() {
		return otherInfo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String toString(){
		return name+","+age+","+gender+","+Arrays.toString(otherInfo);
	}
}
