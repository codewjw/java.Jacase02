package Day09;
/**
 * java异常处理机制中的try-cath
 * 
 * @author 逐忆成书丶
 *
 */
public class ExceptionDemo {
		public static void main(String[] args) {
				System.out.println("程序开始");
				
				try{
					String str="abc";
					//String str="";
					//String str=null;
					System.out.println(str.length());
				
					System.out.println(str.charAt(1));
					
					System.out.println(Integer.parseInt(str));
					//try中出错的代码以下的所有代码都不会运行
					System.out.println("!!!");//不会输出
					/**
					 * catch可以写多个，针对不同的异常有不同的解决手段
					 * 时可以分别捕获这些异常并处理
					 */
				}catch(NullPointerException e){
						System.out.println("出现空指针");
				}catch (StringIndexOutOfBoundsException e) {
						System.out.println("字符串下标越界");
						/**
						 * 应养成一个好习惯，在最后一个catch中捕获
						 * Exception，这样不会因为一个为捕获的异常导致
						 * 程序中断。
						 * 当异常之间存在父子类继承关系时，一定是子类
						 * 异常在上先行捕获，父类异常在下后捕获
						 * 
						 */
				}catch (Exception e) {
						System.out.println("反正就是出了个错");
				} 

				System.out.println("程序结束了");
		}
	
}
