package Day06;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * 
 * @author �������ؼ
 *
 */
public class FileDemo6 {
	public static void main(String[] args) {
		/**
		 * ����ǰĿ¼�е�demoĿ¼ɾ��
		 */
		File file = new File("demo");
		
		if (!file.exists()) {
			/**
			 * delete������ɾ��Ŀ¼��ʱ����Ҫע��
			 * ֻ�и�Ŀ¼��һ����Ŀ¼ʱ����ɾ��
			 */
			file.delete();
			System.out.println("ɾ��Ŀ¼���");
		}else {
			System.out.println("��Ŀ¼������");
		}
		
		
		
		
		
	}
	
}






