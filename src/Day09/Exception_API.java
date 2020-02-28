package Day09;
/**
 * Exception常用方法
 * @author 逐忆成书丶
 *
 */
public class Exception_API {
		public static void main(String[] args) {
				System.out.println("程序开始了");
				try{
					
						String str="abc";
						System.out.println(Integer.parseInt(str));
						
				}catch(Exception e){
						//输出错误堆栈信息，便于定位解决错误
						//e.printStackTrace();
						String message = e.getMessage();
						System.out.println("错误信息："+message);
						
					
				}
				System.out.println("程序结束了");
		}
		
}
