package A11_List;
/**
 * ��Ϊ����Ԫ�ز��Լ�����ز���
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
	 * ͨ��������дtoString���ص��ַ���Ӧ��������ǰ�����
	 * ������Ϣ����ʽ���Խ��ʵ�ʿ������������
	 */
	public String toString(){
		return "("+x+","+y+")";
	}
	/**
	 * Object�ṩ��equals�����������ͼ�ǱȽ����������
	 * �����Ƿ���ͬ���÷������ʹ�ã�������д����ΪObject����
	 * �ṩ���ڲ�ʹ�á�==���Ƚϣ�û��ʵ�����塣
	 * 
	 * ��toString����һ����java API�ṩ����������Ѿ���д�˸÷�����ֻ������
	 * �Լ����������Ҫ������д��
	 * ����String����д��equals
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
