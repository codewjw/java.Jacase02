package Day05;
/**
 * �����Ǳ������Ͽɣ����͵�ԭ�;���Object
 * ֻ�Ǳ���������һЩ����
 * 1.�����ʹ���ʵ���ǣ������������ֵ�Ƿ����㷺��
 * ָ��������  ����������벻ͨ��
 * 2.����ȡ���͵�ֵʱ�����������Զ������Ͳ���
 * @author �������ؼ
 *
 */
public class TestPoint2 {
public static void main(String[] args) {
	/**
	 * ����������ʵ���Ƿ����㷺��Ҫ��
	 * ����ֻ�ܴ�������
	 */
	Point<Integer> p1=new Point<Integer>(1, 2);
	p1.setX(2);
	/**
	 * �������ڱ�������ǻ��޸Ĵ�����ת��
	 * int x=((Integer)p1.getX()).intValue;
	 */
	int x1=p1.getX();
	System.out.println("x1:"+x1);
	
	/**
	 * ��������ָ��������ԭ�ͣ�Object
	 */
	Point p2=p1;
	System.out.println("p2:"+p2);
	p2.setX("��");
	System.out.println("p2:"+p2);
	
	String x2=(String)p2.getX();
	System.out.println("x2:"+x2);
	
	x1=p1.getX();//����ClasCastException,�������쳣
	System.out.println("x1:"+x1);
	
}
}
