package A11_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义类型元素
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
		 * 一个参数的sort方法要求集合元素必须实现Comparable接口
		 * String，包装类都实现了该接口，但是我们自己定义的元素通常不实现该接口
		 * 所以该方法若能直接使用则使用，否则都建议采取下面的方式排序（额外定义个比较器）
		 */
		Collections.sort(list,new Comparator<Point>(){
			/**
			 * 定义两个参数比较大小的规则
			 * 返回值不关注具体取值，只关注取值范围
			 * 当返回值>0:表示o1>o2
			 * 当返回值<0:表示o1<o2
			 * 当返回值=0:表示o1=o2
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
