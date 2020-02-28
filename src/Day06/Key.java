package Day06;
/**
 * ���Զ�������Ԫ����Ҫ��ΪMap�е�Keyʹ��ʱ��ͨ��Ҫע��
 * API�ĵ���Ҳ��˵˵����
 * ��һ������Ҫ��дequals�����Ǿ�Ӧ����ͬ��дhasCode����
 * ������дʱҪע�⣺
 * 
 * 
 * ����������equals�Ƚ�Ϊtrueʱ��hasCode�������ص�����
 * ������ͬ����֮��Ȼ���Ǳ���ģ���Ҳ������֤���������
 * hasCodeֵ����ͬ��equals�Ƚ�ӦΪtrue���������HasMap
 * �в�������Ӱ���ѯ����
 * 
 * hasCode�������ص�����Ӧ��ʱһ���ȶ���ֵ�������ڲ���
 * equals�Ƚϵ�����ֵû�иı��ǰ���£���ε���
 * hasCode�������ص�����Ӧ����һ����
 * 
 * 
 * @author �������ؼ
 *
 */
public class Key {
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
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}
