package Day09;
/**
 * Exception���÷���
 * @author �������ؼ
 *
 */
public class Exception_API {
		public static void main(String[] args) {
				System.out.println("����ʼ��");
				try{
					
						String str="abc";
						System.out.println(Integer.parseInt(str));
						
				}catch(Exception e){
						//��������ջ��Ϣ�����ڶ�λ�������
						//e.printStackTrace();
						String message = e.getMessage();
						System.out.println("������Ϣ��"+message);
						
					
				}
				System.out.println("���������");
		}
		
}
