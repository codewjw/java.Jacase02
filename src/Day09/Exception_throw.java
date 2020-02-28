package Day09;
/**
 * 测试异常的抛出
 * @author 逐忆成书丶
 *
 */
public class Exception_throw {
		public static void main(String[] args) {//throws Exception
			 	Person p=new Person();
			 	
			 	try {
					p.setAge(1000);
				} catch (IllegalAgeException e) {
					e.printStackTrace();
				}
			 	
			 	
			 	
			 	
//			 	p.setAge(20);
			 	/*try {
					p.setAge(20);
				} catch (Exception e) {
					e.printStackTrace();
				}*/
			 	System.out.println("此人年龄："+p.getAge());
		}
}
