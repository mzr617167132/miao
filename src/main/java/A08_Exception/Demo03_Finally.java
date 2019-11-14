package A08_Exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * finally在IO当中的使用
 * @author Administrator
 *
 */
public class Demo03_Finally {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("fos.dat");
			fos.write(1);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
