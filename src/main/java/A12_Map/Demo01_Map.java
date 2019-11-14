package A12_Map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map ���ұ�
 * Map��һ�����õ����ݽṹ�����ֵ�������һ���������еı��
 * �������г�Ϊkey�����г�Ϊvalue��
 * ���Ԫ��ʱ�ɶԴ���ģ���key-value����ʽ���档
 * ��ȡԪ��ʱ����key��ȡ��Ӧ��value
 * �������Ǿ�����һ�����ݼ���ѯ��Щ������ʹ�õ������ֱ���value��Ҫ��ѯ�����ݣ�
 * ����Ӧ��key����ѯ���������б��档
 * MapҪ��key�ǲ������ظ��ġ�
 * 
 * Map������һ���ӿڣ�������MapӦ�����еĹ��ܡ�
 * ����ʵ���ࣺjava.util.HashMap ɢ�б�
 * ɢ�б��ǵ����ѯ�ٶ��������ݽṹ
 * @author M.C.
 *
 */
public class Demo01_Map {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		/*
		 * V put(K k,V v)
		 * ��������һ���ֵ���뵽Map�С�����Map�������ظ���Key��������ʹ������
		 * ��Key�����µ�valueʱ�Ὣ��Keyԭ�е�value���ǣ���put�����ķ���ֵ
		 * ���Ǳ����ǵ�value����key�����ڣ��򷵻�null��
		 */
		Integer num=map.put("����", 99);
		System.out.println("num:"+num);
		map.put("��ѧ", 98);
		map.put("Ӣ��", 97);
		map.put("����", 96);
		map.put("��ѧ", 95);
		System.out.println(map);
		num=map.put("����", 88);
		System.out.println("num:"+num);
		System.out.println(map);
		/*
		 * Integer get(Obj key)
		 * ���ݸ�����key��ȡ��Ӧ��value����������key�����ڣ��򷵻�ֵΪnull
		 */
		num=map.get("��ѧ");
		System.out.println("��ѧ��"+num);
		num=map.get("����");
		System.out.println("������"+num);
		
		int size=map.size();
		System.out.println("size:"+size);
		/*
		 * V remove(obj key)
		 * ��������key��Ӧ�ļ�ֵ��ɾ��������ֵΪvalue����û��ɾ��
		 * �κ������򷵻�ֵΪnull
		 */
		num=map.remove("��ѧ");
		System.out.println(map);
		System.out.println("num:"+num);
		
		boolean ck=map.containsKey("����");
		System.out.println("����key��"+ck);
		
		ck=map.containsValue(100);
		System.out.println("����value��"+ck);
		
	}
}
