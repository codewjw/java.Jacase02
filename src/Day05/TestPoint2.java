package Day05;
/**
 * 泛型是编译器认可，泛型的原型就是Object
 * 只是编译器会做一些工作
 * 1.当泛型传入实参是，编译器会检查该值是否满足泛型
 * 指定的类型  不满足则编译不通过
 * 2.当获取泛型的值时，编译器会自动做造型操作
 * @author 逐忆成书丶
 *
 */
public class TestPoint2 {
public static void main(String[] args) {
	/**
	 * 编译器会检查实参是否满足泛型要求
	 * 这里只能传入整数
	 */
	Point<Integer> p1=new Point<Integer>(1, 2);
	p1.setX(2);
	/**
	 * 编译器在编译程序是会修改代码做转换
	 * int x=((Integer)p1.getX()).intValue;
	 */
	int x1=p1.getX();
	System.out.println("x1:"+x1);
	
	/**
	 * 泛型若不指定，则是原型：Object
	 */
	Point p2=p1;
	System.out.println("p2:"+p2);
	p2.setX("二");
	System.out.println("p2:"+p2);
	
	String x2=(String)p2.getX();
	System.out.println("x2:"+x2);
	
	x1=p1.getX();//报错，ClasCastException,类造型异常
	System.out.println("x1:"+x1);
	
}
}
