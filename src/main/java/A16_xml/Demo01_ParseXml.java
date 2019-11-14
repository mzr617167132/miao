package A16_xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用DOM解析XML文档
 * 添加dom4j依赖
 * @author M.C.
 *
 */
public class Demo01_ParseXml {

	public static void main(String[] args) {
		/*
		 * 解析XML的大致步骤
		 * 1：创建SAXReader
		 * 2：使用SAXReader读取xml文档
		 * 3：获取根元素
		 * 4：按照XML的结构从根元素开始逐级获取子元素以达到
		 *   遍历XML文档数据的目的。
		 */
		try {
			//保存所有解析出来的员工信息
			List<Emp>empList=new ArrayList<Emp>();
			
			//1
			SAXReader reader=new SAXReader();
			//2
			Document doc=reader.read(new File("emplist.xml"));
			//3 获取根元素
			Element root=doc.getRootElement();
			/*
			 * Elenment类的每一个实例用于表示XML文档的一个元素
			 * 其提供了获取相关信息的一系列方法：
			 * String getName（）
			 * 获取当前元素的名字（标签名）
			 * 
			 * String getText（）
			 * 获取当前元素中间的文本（开始，结束标签中间的文本）
			 * 
			 * Element element（String name）
			 * 获取指定名字的子标签
			 * 
			 * List elements()
			 * 获取所有子标签
			 * 
			 * List elements（String name）
			 * 获取所有同名子便签
			 */
			System.out.println("根元素："+root);
			//获取根标签下的所有<emp>标签
			List<Element>list=root.elements("emp");
			System.out.println(list.size());
			for(Element e:list){
				Element nameFile=e.element("name");
				String name=nameFile.getTextTrim();
				int age=Integer.parseInt(e.element("age").getTextTrim());
				String gender=e.elementText("gender");
				int salary=Integer.parseInt(e.elementText("salary"));
				int id=Integer.parseInt(e.attributeValue("id"));
				
				Emp emp=new Emp(id, name, age, gender, salary);
				empList.add(emp);
				
			}
			for(Emp e:empList){
				System.out.println(e);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
