package Day05;
/**
 * ���ͣ��ֳ�Ϊ����������
 * JDK1.5֮���Ƴ���һ������
 * ���Ϳ��Ա�ʾ���Ե����ͣ����������������Լ�����ֵ
 * @author �������ؼ
 *
 */
public class Point<T>{
	private T x;
	private T y;
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	public Point(T i, T y) {
		super();
		this.x = i;
		this.y = y;
	}

}
