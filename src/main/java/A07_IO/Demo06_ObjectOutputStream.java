package A07_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流是一对高级流，使用它们可以轻松的将任何java对象进行读写
 * @author Administrator
 *
 */
public class Demo06_ObjectOutputStream {

	public static void main(String[] args) throws IOException {
		/**
		 * 将一个Person实例写入到文件person.obj中任何数据想写入文件
		 * 都要先转换为2进制，而将一个java对象转换为一组2进制可以使用对象
		 * 输出流来完成。
		 */
		String name="苍老师";
		int age=18;
		String gender="女";
		String[]otherInfo={"是一名演员","爱好是写毛笔字"};
		Person p=new Person(name,age,gender,otherInfo);
		System.out.println(p);
		//负责将字节写入文件
		FileOutputStream fos=new FileOutputStream("person.obj");
		//负责将对象转换为字节
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		/**
		 * 对象流的写对象方法会先将给定的对象按照其结构转换为一组字节后将数据交给其连接的流进行
		 * 后续处理，这里直接连接的是文件流，所以数据直接被写入了文件。
		 * 
		 * 对于要写出的对象有一个要求，其所属的类必须实现接口：java.io.Serializable
		 * 否则写出时会抛出异常：NotSerializableException
		 */
		/**
		 * 这里将一个对象写入文件经历了两个步骤
		 * 1：对象经过对象输出流写出时，对象输出流会先将该对象按照其结果转换为一组字节，这个
		 * 过程称为对象序列化
		 * 
		 * 2：序列化后的字节在流经文件输出流后被写入文件（硬盘中）做长久保存。将数据写入硬盘的过程称为
		 * 数据持久化。
		 */
		oos.writeObject(p);
		System.out.println("finish");
		oos.close();
	}

}
