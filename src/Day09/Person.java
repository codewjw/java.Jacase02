package Day09;
/**
 * ʹ�������������throw��throws������
 * @author �������ؼ
 *
 */
public class Person {
		private int age;

		public int getAge() {
			return age;
		}

		/**
		 * throw�ؼ��������׳��쳣
		 * ͨ������������׳��쳣:
		 * 1.�������﷨Ҫ�󣬵�������ʵ��ҵ���߼�ʱ������
		 * ����һ���쳣�׳�ȥ
		 * 2.�ڵ�ǰ�����г�����һ��ʵ�ʵ��쳣����hi��Ӧ����
		 * ��ǰ�����д�����쳣ʱ�����Խ����׳�
		 * @param age
		 */
		public void setAge(int age) throws IllegalAgeException{//Exception
			if(age<0||age>100){
				
				/**
				 * ���׳�һ����RuntimeExcption��������
				 * �쳣֮������������쳣ʱ��������Ҫ��
				 * ���봦���쳣����û�д�����������
				 * ��ͨ���������ֶ�����:
				 * 1:ʹ��try-catch���񲢴���
				 * 2:�ڵ�ǰ������ʹ��throws�������쳣���׳�
				 * 
				 */
				
					throw new IllegalAgeException("���䲻�Ϸ�");
					//throw new Exception("���䲻�Ϸ�");
//					throw new RuntimeException("���䲻�Ϸ�");
					/*try {
						throw new Exception("���䲻�Ϸ�");
						
					} catch (Exception e) {
						
					}*/
					
					
			}
			
			this.age = age;
		}
		
	
}
