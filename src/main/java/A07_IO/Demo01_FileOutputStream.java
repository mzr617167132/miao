package A07_IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java IO ��׼�����������
 * javaͨ��IO�ṩ�˱�׼��ͳһ�Ķ�д����豸�ķ�ʽ��
 * 
 * �����շ����Ϊ���������������������Ź��ܣ�
 * ������������絽����ķ�����������ȡ���ݵģ��Ƕ�����
 * ��������ӳ������ķ����������������ݵģ���д����
 * 
 * java��������Ϊ���࣬�ֱ��ǽڵ����봦������
 * �ڵ������ֽ����ͼ�������ʵ�����ӳ���������Դ�Ĺܵ�������ʵ��
 * �����ˡ����ݵ�������������Դ����ȷ�ģ���дһ���ǽ����ڽڵ����Ļ����Ͻ��еġ�
 * 
 * ���������ֽ����߼������ص㣺���ܶ������ڣ�û�����壩�������������������ϣ�Ŀ��
 * �ǵ�����������ǰ��ʱ���Զ������ĳЩ�ӹ����������Ƕ����ݵĲ�����
 * 
 * ����ʹ��ͨ���������ɸ߼��������������մ����ͼ���������ˮ�ߵļӹ��������ж�д������
 * ���ִ������Ĳ���Ҳ��Ϊ���������ӣ���Ҳ��IO�ľ������ڡ�
 * 
 * java.io.InputStream��java.io.OutputStream��һ�Գ����࣬Ҳ��
 * �����ֽ��������ĳ��࣬�����������ֽ�����Ӧ���߱��Ķ�д�ֽڷ�����
 * 
 * �ļ���
 * java.io.FileInputStream:�ļ������������ڶ�ȡ�ļ����ݵ����̳���InputStream
 * java.io.FileOutputStream���ļ������������д���ݵ��ļ��������̳���OutputStream
 * 
 * �ļ�����RandomAccessFile
 * �ļ�����RAF����������д�ļ���API�����ǵײ�Ķ�д��ʽ��ͬ��
 * RAF�ǻ���ָ��������д��ʽ�����Զ��ļ�����λ�ý��ж�д�����ڱ༭�ļ����ݵȲ�������
 * �ļ����ǻ���IO��׼�Ķ�д��ʽ����˳���д�ġ�����ֻ��˳��������д�����ɻ��ˡ���������
 * �����ӣ����ǿ��Դ������ָ߼�����ɸ��ָ������ݵĶ�д������
 *
 */
public class Demo01_FileOutputStream {

	public static void main(String[] args) throws IOException {
		/**
		 * �������ִ�����ʽ
		 * 1������дģʽ
		 * FileOutputStream��String path��
		 * FileOutputStream��File file��
		 * ���ִ�����ʽ����������ָ�����ļ��Ѿ����ڣ���ô���Ƚ�������ȫ�������Ȼ��
		 * ͨ����д�������д���ļ���
		 * 
		 * 2��׷��ģʽ
		 * FileOutputStream��String path��boolean appen��
		 *FileOutputStream��File file��boolean appen��
		 *���ļ��Ѿ����ڣ�������ȫ��������ͨ����ǰ��д������ݻᱻ׷�ӵ��ļ�ĩβ
		 */
//����ģʽ
		FileOutputStream fos=new FileOutputStream("fos.txt");
//׷��ģʽ
//		FileOutputStream fos=new FileOutputStream("fos.txt",true);
		String str="���ˣ��о������Ѿ������˸߳�";
		byte []data=str.getBytes("utf-8");
		fos.write(data);
		fos.close();
	
	
	}

}
