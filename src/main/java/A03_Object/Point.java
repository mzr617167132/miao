package A03_Object;
/**
 * Object是所有类的超类
 * Object中定义的方法很少，有两个比较常见的：
 * toString，equals
 * @author Administrator
 *
 */
public class Point {
	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * 通常我们重写toString返回的字符串应当包含当前对象的
	 * 属性信息，格式可以结合实际开发需求而定。
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * Object提供的equals方法的设计意图是比较两个对象的
	 * 内容是否相同。该方法如果使用，必须重写，因为Object本身
	 * 提供是内部使用“==”比较，没有实际意义。
	 * 
	 * 与toString方法一样，java API提供的类基本都已经重写了该方法，只有我们
	 * 自己定义的类需要额外重写。
	 * 比如String就重写了equals
	 */
	
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(obj==this){
			return true;
		}
		if(obj instanceof Point){
			Point p=(Point)obj;
			return this.x==p.x&&this.y==p.y;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
