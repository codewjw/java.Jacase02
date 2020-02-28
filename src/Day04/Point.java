package Day04;
import java.util.Objects;
/**
 * 该类作为集合元素进行测试集合方法使用
 */
public class Point {
	  private  int x;
	    private  int y;
	    public Point(){

	    }

	    @Override
	    public String toString() {
	        return "Point{" +
	                "x=" + x +
	                ", y=" + y +
	                '}';
	    }

	    @Override
	    public boolean equals(Object o){
	        if (o==null){
	            return false;
	        }
	        if (o==this){
	            return true;
	        }
	        if (o instanceof Point){
	            Point p=new Point();
	            return  this.x==p.x&&this.y==p.y;
	        }
	        return false;
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

	    public Point(int x, int y) {
	        super();
	        this.x = x;
	        this.y = y;
	    }

}
