package Day09;
/**
 * java�쳣��������е�try-cath
 * 
 * @author �������ؼ
 *
 */
public class ExceptionDemo {
		public static void main(String[] args) {
				System.out.println("����ʼ");
				
				try{
					String str="abc";
					//String str="";
					//String str=null;
					System.out.println(str.length());
				
					System.out.println(str.charAt(1));
					
					System.out.println(Integer.parseInt(str));
					//try�г���Ĵ������µ����д��붼��������
					System.out.println("!!!");//�������
					/**
					 * catch����д�������Բ�ͬ���쳣�в�ͬ�Ľ���ֶ�
					 * ʱ���Էֱ𲶻���Щ�쳣������
					 */
				}catch(NullPointerException e){
						System.out.println("���ֿ�ָ��");
				}catch (StringIndexOutOfBoundsException e) {
						System.out.println("�ַ����±�Խ��");
						/**
						 * Ӧ����һ����ϰ�ߣ������һ��catch�в���
						 * Exception������������Ϊһ��Ϊ������쳣����
						 * �����жϡ�
						 * ���쳣֮����ڸ�����̳й�ϵʱ��һ��������
						 * �쳣�������в��񣬸����쳣���º󲶻�
						 * 
						 */
				}catch (Exception e) {
						System.out.println("�������ǳ��˸���");
				} 

				System.out.println("���������");
		}
	
}
