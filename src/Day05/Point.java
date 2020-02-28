package Day05;
/**
 * 泛型，又称为参数化类型
 * JDK1.5之后推出的一个特性
 * 泛型可以表示属性的类型，方法参数的类型以及返回值
 * @author 逐忆成书丶
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
