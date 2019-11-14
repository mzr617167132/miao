package A10_Collection;
/**
 * JDK5之后推出了一个特性：
 * 增强for循环，也称为：新循环，for each
 * 新循环不取代传统for循环的工作，它只用来遍历集合或数字
 * @author M.C.
 *
 */
public class Demo05_NewFor {

	public static void main(String[] args) {
		String []arr={"1","2","3","4"};
		for(int i=0;i<arr.length;i++){
			String str=arr[i];
			System.out.println(str);
		}
		/*
		 * 新循环是编译器认可的，而非虚拟机。
		 * 编译器编译时会将新循环遍历数组改为普通for循环遍历
		 */
		for(String str:arr){
			System.out.println(str);
		}
		
	}

}
