package Day08;

import java.io.Serializable;
import java.util.List;

/**
 * ʹ�ø��������Զ����д����
 * 
 * @author �������ؼ
 *
 */
public class Person implements Serializable {
	
		/**
		 * ��һ����ʵ����Serializable�ӿں�Ӧ������һ��
		 * ����:�汾��serialVersionUID
		 * ������û�ж��壬ϵͳ����ݵ�ǰ��Ľṹ����һ����
		 * ����ֻҪ��ǰ��Ľṹ�����仯���汾�žͻᷢ���仯
		 * �汾�ž�����һ�������Ƿ���Է����л��ɹ�:
		 * ��ObjectIuputStream��ȡһ��������ֽڲ����з�
		 * ���л�ʱ������ö���İ汾���뵱ǰ��İ汾��
		 * �Ƿ�һ�£�һ�������л��ɹ�����һ�������л�
		 * ʧ��
		 * ����ָ���汾�ſ��Կ��Ʒ����л��Ľ��
		 */
	
		/**
		 * transient�ؼ���
		 * ���ùؼ������ε������ڽ��ж������л�ʱ��ֵ�ᱻ
		 * ���ԡ����������Դﵽ���������Ч��
		 */
	
		private static final long  serialVersionUID=1L;
		private String name;
		private double salary;
		private String gender;
		private transient List<String> otherInfo;
		public Person(String name, double salary, String gender, 
								List<String> otherInfo) {
			super();
			this.name = name;
			this.salary = salary;
			this.gender = gender;
			this.otherInfo = otherInfo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public List<String> getOtherInfo() {
			return otherInfo;
		}
		public void setOtherInfo(List<String> otherInfo) {
			this.otherInfo = otherInfo;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", salary=" + salary + ", gender=" + gender + ", otherInfo=" + otherInfo
					+ "]";
		}
		
		
		
}
