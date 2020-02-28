package Day09;
/**
 * 使用这个类来测试throw，throws的作用
 * @author 逐忆成书丶
 *
 */
public class Person {
		private int age;

		public int getAge() {
			return age;
		}

		/**
		 * throw关键字用于抛出异常
		 * 通常两种情况会抛出异常:
		 * 1.当满足语法要求，但不满足实际业务逻辑时，可以
		 * 当成一个异常抛出去
		 * 2.在当前方法中出现了一个实际的异常，但hi不应当在
		 * 当前方法中处理该异常时，可以将其抛出
		 * @param age
		 */
		public void setAge(int age) throws IllegalAgeException{//Exception
			if(age<0||age>100){
				
				/**
				 * 当抛出一个除RuntimeExcption及其子类
				 * 异常之外的其他类型异常时，编译器要求
				 * 必须处理异常，若没有处理代码则编译
				 * 不通过。处理手段两种:
				 * 1:使用try-catch捕获并处理
				 * 2:在当前方法上使用throws声明该异常地抛出
				 * 
				 */
				
					throw new IllegalAgeException("年龄不合法");
					//throw new Exception("年龄不合法");
//					throw new RuntimeException("年龄不合法");
					/*try {
						throw new Exception("年龄不合法");
						
					} catch (Exception e) {
						
					}*/
					
					
			}
			
			this.age = age;
		}
		
	
}
