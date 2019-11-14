package A12_Map;
/**
 * HashMap是当今查询速度最快的数据结构
 * HashMap内部使用数组保存元素，保存时根据key元素的hashcode计算
 * 这组键值对应当保存在数组的下标位置，并将其存入数组。查找时也是根据key
 * 元素的hashcode值计算下标位置并从数组中提取该元素。这样避免了查询
 * 元素时对数组的遍历操作，所以HashMap查询元素的效率不受数据量所影响。
 * 
 * API手册上有明确的说明，使用散列表时尽可能避免链表的产生，因为链表会
 * 影响其查询性能。
 * 产生链表：
 * 当两个key的hashcode值相同（意味着计算出的数组下标位置相同），但是equals
 * 比较不同（意味着HashMap认为他们是不同的key）那么就会在HashMap内部数组
 * 相同位置产生一个链表保存他们。
 * 
 * hashCode方法与equals方法时Object定义的方法，所以java中
 * 所有的类都具有这两个方法。API中Object类对这两个方法的重写有
 * 明确说明：
 * 1：成对重写，即：当我们需要重写一个类的equals方法时就应当连同重写
 * 	 hashCode方法
 * 2：一致性，即：当两个对象equals比较为true时，那么hashCode方法
 * 返回的数字必须相等。反过来则不是必须的，但是尽量保证当相同类型的两个对象
 * hashCode值相等时，equals方法比较也为true，否则会在HashMap中
 * 产生链表
 * 3：稳定性，即：当参数equals比较的属性的值没有发生过改变的前提下，多次
 * 调用hashCode方法返回的数字不应发生改变。
 * 
 * 
 * 注：Object已经对这两个方法妥善重写了。一旦子类需要重写必须注意以上几点
 * @author M.C.
 *
 */
public class Demo03_Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo03_Key other = (Demo03_Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	

}
