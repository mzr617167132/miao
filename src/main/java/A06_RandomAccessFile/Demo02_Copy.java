package A06_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * �ļ�����
 * @author Administrator
 *
 */
public class Demo02_Copy {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile scr=new RandomAccessFile("./bee0.png", "r");
		RandomAccessFile desc=new RandomAccessFile("./bee0_cp.png", "rw");
		//����ÿ��ʵ�ʶ�ȡ���ֽ�
		int d=-1;
		while((d=scr.read())!=-1){
			desc.write(d);
		}
		System.out.println("�������");
		scr.close();
		desc.close();
		
	}

}
