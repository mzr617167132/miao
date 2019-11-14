package A11_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * �����Զ�������Ԫ��
 * @author M.C.
 *
 */
public class Demo04_SortList2 {

	public static void main(String[] args) {
		List<Point>list=new ArrayList<>();
		list.add(new Point(3,6));
		list.add(new Point(4,5));
		list.add(new Point(1,7));
		list.add(new Point(3,9));
		System.out.println(list);
		/**
		 * һ��������sort����Ҫ�󼯺�Ԫ�ر���ʵ��Comparable�ӿ�
		 * String����װ�඼ʵ���˸ýӿڣ����������Լ������Ԫ��ͨ����ʵ�ָýӿ�
		 * ���Ը÷�������ֱ��ʹ����ʹ�ã����򶼽����ȡ����ķ�ʽ���򣨶��ⶨ����Ƚ�����
		 */
		Collections.sort(list,new Comparator<Point>(){
			/**
			 * �������������Ƚϴ�С�Ĺ���
			 * ����ֵ����ע����ȡֵ��ֻ��עȡֵ��Χ
			 * ������ֵ>0:��ʾo1>o2
			 * ������ֵ<0:��ʾo1<o2
			 * ������ֵ=0:��ʾo1=o2
			 */
			public int compare(Point o1, Point o2) {
				int olen1=o1.getX()*o1.getX()+o1.getY()*o1.getY();
				int olen2=o2.getX()*o2.getX()+o2.getY()*o2.getY();
				return olen1-olen2;
			}
		});
		System.out.println(list);
	}

}
