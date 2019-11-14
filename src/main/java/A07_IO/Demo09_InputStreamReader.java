package A07_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ×ª»»Á÷
 * ¶ÁÈ¡×Ö·û
 */
public class Demo09_InputStreamReader {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("osw.txt");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		int d=-1;
		while((d=isr.read())!=-1){
			char c=(char)d;
			System.out.print(c);
		}
		isr.close();
		
		
	}

}
