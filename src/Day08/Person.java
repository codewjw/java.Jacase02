package Day08;

import java.io.Serializable;
import java.util.List;

/**
 * 使用该类来测试对象读写操作
 * 
 * @author 逐忆成书丶
 *
 */
public class Person implements Serializable {
	
		/**
		 * 当一个类实现了Serializable接口后，应当定义一个
		 * 常量:版本号serialVersionUID
		 * 若我们没有定义，系统会根据当前类的结构生成一个，
		 * 但是只要当前类的结构发生变化，版本号就会发生变化
		 * 版本号决定着一个对象是否可以反序列化成功:
		 * 当ObjectIuputStream读取一个对象的字节并进行反
		 * 序列化时，会检查该对象的版本号与当前类的版本号
		 * 是否一致，一致则反序列化成功。不一致则反序列化
		 * 失败
		 * 自行指定版本号可以控制反序列化的结果
		 */
	
		/**
		 * transient关键字
		 * 被该关键字修饰的属性在进行对象序列化时其值会被
		 * 忽略。这样做可以达到对象瘦身的效果
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
