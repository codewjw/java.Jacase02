package Day09;

import java.awt.*;
import java.io.IOException;

/**
 * 子类重写父类含有throws异常抛出生命的方法时
 * 对throws得重写原则
 * @author 逐忆成书丶
 *
 */
public class Exception_throws {
		public  void dosome()
				throws IOException,AWTException{
		}
}

class Son extends Exception_throws{
//	public void dosome(){
//		//不在抛任何异常
//	}
	
	//可以只抛部分异常
//	public  void dosome()
//			throws IOException{
//		
//	}
	
	//可以抛出父类方法抛出子类型异常
//	public  void dosome()
//			throws FileAlreadyExistsException{
//		
//	}
	
	//不可以抛出额外异常
//	public  void dosome()throws SQLException{
//			
//	}
	
	//不可以抛出父类方法抛出异常的父类型异常
//	public  void dosome()throws Exception{
//		
//	}
}






