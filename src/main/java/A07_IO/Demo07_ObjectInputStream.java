package A07_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流
 * 将一组字节按照其结构还原为其表示的对象。需要注意，
 * 这组对象应当是通过对象输出流将一个对象转换的一组字节。
 * @author Administrator
 *
 */
public class Demo07_ObjectInputStream {

	public static void main(String[] args) throws IOException, Exception {
		FileInputStream fis=new FileInputStream("person.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		/**
		 * 对象输入流读取一组字节并按照其结构还原为java对象的这个过程称为：对象反序列化
		 */
		Person p=(Person)ois.readObject();
		System.out.println(p);
		ois.close();
	}

}
