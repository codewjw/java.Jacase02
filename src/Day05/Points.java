package Day05;
/**
 * ������Ϊ����Ԫ�ز���Collections�Լ�������
 * @author �������ؼ
 *
 */
public class Points implements Comparable<Points>{
	private int x;
	private int y;
	public String toString() {
		return "Points [x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Points(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	/**
	 * �÷������������嵱ǰ����this���ڸ�������o
	 * ֮��Ĵ�С��ϵ
	 * ��������һ��intֵ����ֵ�������ľ���ȡֵ��ֻ����
	 * ȡֵ��Χ����
	 * ����ֵ>0:��ǰ������ڲ�������(this>o)
	 * ����ֵ<0:��ǰ����С�ڲ�������
	 * ����ֵ=0:�����������
	 */
	public int compareTo(Points o) {
		int len=this.x*this.x+this.y*this.y;
		int olen=o.x*o.x+o.y*o.y;
		
		return len-olen;
	}
	
	
	
}
