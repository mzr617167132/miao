package A07_IO;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的对象读写操作
 * 
 * Serializable接口没有定义任何方法，但是当编译器在编译当前源代码时发现
 * 当前类实现了该接口时，会隐含着添加一个方法用于将当前类实例转换为一组字节。
 */
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private transient String []otherInfo;
	/**
	 * 当一个属性被关键字transient修饰后，那么当前实例若序列化时，这个属性的值会被忽略。
	 * 忽略不必要的属性可以达到对象序列化的瘦身操作，减少不必要的资源开销。
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
