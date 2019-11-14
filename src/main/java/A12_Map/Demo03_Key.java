package A12_Map;
/**
 * HashMap�ǵ����ѯ�ٶ��������ݽṹ
 * HashMap�ڲ�ʹ�����鱣��Ԫ�أ�����ʱ����keyԪ�ص�hashcode����
 * �����ֵ��Ӧ��������������±�λ�ã�������������顣����ʱҲ�Ǹ���key
 * Ԫ�ص�hashcodeֵ�����±�λ�ò�����������ȡ��Ԫ�ء����������˲�ѯ
 * Ԫ��ʱ������ı�������������HashMap��ѯԪ�ص�Ч�ʲ�����������Ӱ�졣
 * 
 * API�ֲ�������ȷ��˵����ʹ��ɢ�б�ʱ�����ܱ�������Ĳ�������Ϊ�����
 * Ӱ�����ѯ���ܡ�
 * ��������
 * ������key��hashcodeֵ��ͬ����ζ�ż�����������±�λ����ͬ��������equals
 * �Ƚϲ�ͬ����ζ��HashMap��Ϊ�����ǲ�ͬ��key����ô�ͻ���HashMap�ڲ�����
 * ��ͬλ�ò���һ�����������ǡ�
 * 
 * hashCode������equals����ʱObject����ķ���������java��
 * ���е��඼����������������API��Object�����������������д��
 * ��ȷ˵����
 * 1���ɶ���д��������������Ҫ��дһ�����equals����ʱ��Ӧ����ͬ��д
 * 	 hashCode����
 * 2��һ���ԣ���������������equals�Ƚ�Ϊtrueʱ����ôhashCode����
 * ���ص����ֱ�����ȡ����������Ǳ���ģ����Ǿ�����֤����ͬ���͵���������
 * hashCodeֵ���ʱ��equals�����Ƚ�ҲΪtrue���������HashMap��
 * ��������
 * 3���ȶ��ԣ�����������equals�Ƚϵ����Ե�ֵû�з������ı��ǰ���£����
 * ����hashCode�������ص����ֲ�Ӧ�����ı䡣
 * 
 * 
 * ע��Object�Ѿ�������������������д�ˡ�һ��������Ҫ��д����ע�����ϼ���
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
