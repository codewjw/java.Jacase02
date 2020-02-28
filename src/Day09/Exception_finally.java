package Day09;
/**
 * finally快
 * 在异常捕获机制中，finally块是最后一部分。她只能
 * 跟在try块之后，或者最后一个catch之后
 * finally可以保证该块其中的代码【必定】执行，无论try
 * 中的代码是否出现异常
 * 通常会将无论如何都要运行的代码放在里面，比如流操作
 * 中的关闭流这个工作
 * 
 * @author 逐忆成书丶
 *
 */
public class Exception_finally {
		public static void main(String[] args) {
			System.out.println("程序开始");
			try{
//				String str=null;
				String str="";
				System.out.println(str.length());
				return;//就算方法return,finally依然执行
				
			}catch(Exception e){
					System.out.println("出错了");
			}finally {
					System.out.println("finally中的代码");
			}
			
			System.out.println("结束");
			
		}
}











