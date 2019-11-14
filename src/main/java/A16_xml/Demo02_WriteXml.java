package A16_xml;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 写出XML文档
 * @author M.C.
 *
 */
public class Demo02_WriteXml {

	public static void main(String[] args) {
		/*
		 * 生成XML文档的大致步骤
		 * 1：创建一个Document对象表示空白文档
		 * 2：向Document中添加根元素
		 * 3：按照XML的结构逐级添加子元素
		 * 4：创建XmlWriter
		 * 5：将Document通过XMLWriter写出以形成XML文档
		 */
		try {
			List<Emp>empList=new ArrayList<Emp>();
			empList.add(new Emp(1,"张三",22,"男",5000));
			empList.add(new Emp(2,"刘武",12,"男",8000));
			empList.add(new Emp(3,"赵六",36,"女",6000));
			empList.add(new Emp(4,"李四",10,"女",9500));
			empList.add(new Emp(5,"王八",68,"男",3000));
			
			Document doc=DocumentHelper.createDocument();
			/*
			 * Document提供了添加根元素的操作：
			 * Element addElement（String name）
			 * 该方法的返回值为Element实例，表示添加的根元素
			 * 以便我们对根元素做其他追加操作。
			 * 该方法只能调用一次，因为一个文档只允许有一个根
			 */
			Element root=doc.addElement("list");
			
			for(Emp e:empList){
				Element empEle=root.addElement("emp");
				Element nameEle=empEle.addElement("name");
				nameEle.addText(e.getName());
				Element ageEle=empEle.addElement("age");
				ageEle.addText(e.getAge()+"");
				empEle.addElement("gender").addText(e.getGender());
				empEle.addElement("salary").addText(e.getSalary()+"");
				empEle.addAttribute("id", e.getId()+"");
			}
			 
			FileOutputStream fos=new FileOutputStream("myemp.xml");
			XMLWriter writer=new XMLWriter(fos,OutputFormat.createPrettyPrint());
			writer.write(doc);
			System.out.println("finish");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
