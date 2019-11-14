package A16_xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ʹ��DOM����XML�ĵ�
 * ���dom4j����
 * @author M.C.
 *
 */
public class Demo01_ParseXml {

	public static void main(String[] args) {
		/*
		 * ����XML�Ĵ��²���
		 * 1������SAXReader
		 * 2��ʹ��SAXReader��ȡxml�ĵ�
		 * 3����ȡ��Ԫ��
		 * 4������XML�Ľṹ�Ӹ�Ԫ�ؿ�ʼ�𼶻�ȡ��Ԫ���Դﵽ
		 *   ����XML�ĵ����ݵ�Ŀ�ġ�
		 */
		try {
			//�������н���������Ա����Ϣ
			List<Emp>empList=new ArrayList<Emp>();
			
			//1
			SAXReader reader=new SAXReader();
			//2
			Document doc=reader.read(new File("emplist.xml"));
			//3 ��ȡ��Ԫ��
			Element root=doc.getRootElement();
			/*
			 * Elenment���ÿһ��ʵ�����ڱ�ʾXML�ĵ���һ��Ԫ��
			 * ���ṩ�˻�ȡ�����Ϣ��һϵ�з�����
			 * String getName����
			 * ��ȡ��ǰԪ�ص����֣���ǩ����
			 * 
			 * String getText����
			 * ��ȡ��ǰԪ���м���ı�����ʼ��������ǩ�м���ı���
			 * 
			 * Element element��String name��
			 * ��ȡָ�����ֵ��ӱ�ǩ
			 * 
			 * List elements()
			 * ��ȡ�����ӱ�ǩ
			 * 
			 * List elements��String name��
			 * ��ȡ����ͬ���ӱ�ǩ
			 */
			System.out.println("��Ԫ�أ�"+root);
			//��ȡ����ǩ�µ�����<emp>��ǩ
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
