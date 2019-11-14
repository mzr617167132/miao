 package A10_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection�ṩ��һ��ͨ�õı�������Ԫ�صķ�ʽ��
 * ������ģʽ
 * Iterator iterator����
 * �÷����᷵��һ��������ǰ���ϵĵ�����
 * java.util.Iterator�ӿ�
 * �������ӿڣ��涨�˵������������ϵķ�ʽ����ͬ�ļ���ʵ���඼�ṩ��
 * һ�����ڱ�������Ԫ�صĵ�����ʵ���ࡣ�������������Щʵ��������֡�ֻ��Ҫ��������Itertor
 * ʹ�ü���
 * 
 * ����������������ѭ���ʣ�ȡ��ɾ�ı������̣�����ɾ��Ԫ�ز��Ǳ����ı��������
 * @author M.C.
 *
 */
public class Demo04_Iterator {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
		//��ȡ�����ü��ϵĵ�����
		Iterator<String> it=c.iterator();
		/*
		 * ���������÷�����
		 * boolean hasNext()
		 * �ж��Ƿ�����һ��Ԫ�ؿ��Ա���
		 * 
		 * E next����
		 * ��ȡ��һ��Ԫ��
		 * ע�⣺������hasNext����Ϊtrue��ǰ���²ſ��Ե���next����
		 * ������׳��쳣
		 */
		while(it.hasNext()){
			String o=(String)it.next();
			System.out.println(o);
			if("#".equals(o)){
				/*
				 * ������Ҫ���ڱ����Ĺ����в�����ͨ����������ķ�����ɾԪ��
				 * c.remove(o)
				 */
				/*
				 * �������ṩ��remove����ɾ������ͨ��next�����õ���Ԫ��
				 */
				it.remove();
			}
		}
		System.out.println(c);
	}

}
