package Day06;

import java.io.File;

/**
 * ����һ��Ŀ¼�е���������
 * @author �������ؼ
 *
 */
public class FileDemo7 {
	public static void main(String[] args) {
		/**
		 * �鿴��ǰĿ¼�е���������
		 */
		
		File file = new File(".");
		
		/**
		 * boolean isDirectory()
		 * �жϵ�ǰFile�����ʾ���Ƿ�Ϊһ��Ŀ¼
		 * 
		 * 
		 * boolean isFile()
		 * �жϵ�ǰFile�����ʾ���Ƿ�Ϊһ���ļ�
		 * 
		 */
		if (file.isDirectory()) {
			/**
			 * File[] listFiles()
			 * ��ȡ��ǰFile�����ʾ��Ŀ¼�е���������
			 */
			
			File[] listFiles = file.listFiles();
			for(File sub:listFiles){
				System.out.println(sub.getName());
			}
		}
		
		
		
		
		
		
		
		
	}
}




