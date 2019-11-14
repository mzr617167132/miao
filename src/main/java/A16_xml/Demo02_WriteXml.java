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
 * д��XML�ĵ�
 * @author M.C.
 *
 */
public class Demo02_WriteXml {

	public static void main(String[] args) {
		/*
		 * ����XML�ĵ��Ĵ��²���
		 * 1������һ��Document�����ʾ�հ��ĵ�
		 * 2����Document����Ӹ�Ԫ��
		 * 3������XML�Ľṹ�������Ԫ��
		 * 4������XmlWriter
		 * 5����Documentͨ��XMLWriterд�����γ�XML�ĵ�
		 */
		try {
			List<Emp>empList=new ArrayList<Emp>();
			empList.add(new Emp(1,"����",22,"��",5000));
			empList.add(new Emp(2,"����",12,"��",8000));
			empList.add(new Emp(3,"����",36,"Ů",6000));
			empList.add(new Emp(4,"����",10,"Ů",9500));
			empList.add(new Emp(5,"����",68,"��",3000));
			
			Document doc=DocumentHelper.createDocument();
			/*
			 * Document�ṩ����Ӹ�Ԫ�صĲ�����
			 * Element addElement��String name��
			 * �÷����ķ���ֵΪElementʵ������ʾ��ӵĸ�Ԫ��
			 * �Ա����ǶԸ�Ԫ��������׷�Ӳ�����
			 * �÷���ֻ�ܵ���һ�Σ���Ϊһ���ĵ�ֻ������һ����
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
