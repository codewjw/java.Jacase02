package Day09;
/**
 * finally��
 * ���쳣��������У�finally�������һ���֡���ֻ��
 * ����try��֮�󣬻������һ��catch֮��
 * finally���Ա�֤�ÿ����еĴ��롾�ض���ִ�У�����try
 * �еĴ����Ƿ�����쳣
 * ͨ���Ὣ������ζ�Ҫ���еĴ���������棬����������
 * �еĹر����������
 * 
 * @author �������ؼ
 *
 */
public class Exception_finally {
		public static void main(String[] args) {
			System.out.println("����ʼ");
			try{
//				String str=null;
				String str="";
				System.out.println(str.length());
				return;//���㷽��return,finally��Ȼִ��
				
			}catch(Exception e){
					System.out.println("������");
			}finally {
					System.out.println("finally�еĴ���");
			}
			
			System.out.println("����");
			
		}
}











