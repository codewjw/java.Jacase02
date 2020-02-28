package Day05;
/**
 * 该类作为集合元素测试Collections对集合排序
 * @author 逐忆成书丶
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
	 * 该方法是用来定义当前对象this，于给定对象o
	 * 之间的大小关系
	 * 方法返回一个int值。该值并不关心具体取值，只关心
	 * 取值范围，当
	 * 返回值>0:当前对象大于参数对象(this>o)
	 * 返回值<0:当前对象小于参数对象
	 * 返回值=0:两个对象相等
	 */
	public int compareTo(Points o) {
		int len=this.x*this.x+this.y*this.y;
		int olen=o.x*o.x+o.y*o.y;
		
		return len-olen;
	}
	
	
	
}
