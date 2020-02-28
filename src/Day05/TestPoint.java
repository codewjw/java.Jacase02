package Day05;

public class TestPoint {
public static void main(String[] args) {
	Point<Integer> p=new Point<Integer>(1, 2);
	p.setX(2);
	System.out.println(p);
	int x1=p.getX();
	System.out.println("x1:"+x1);
	
	Point<Double> p2=new Point<Double>(1.1, 1.2);
	p2.setX(2.2);
	System.out.println(p2);
	double x2=p2.getX();
	System.out.println("x2:"+x2);
	
	Point<String> p3=new Point<String>("Ò»", "¶þ");
	p3.setX("¶þ");
	System.out.println(p3);
	String x3=p3.getX();
	System.out.println("x3:"+x3);

}
}
