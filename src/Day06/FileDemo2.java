package Day06;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ�����ļ�
 * @author �������ؼ
 *
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		/**
		 * �ڵ�ǰĿ¼�´���һ����Ϊtest.txt���ļ�
		 */
		File file = new File("."+File.separator+"test.txt");
		boolean exists = file.exists();
		
	/**
	 * boolean exists()
	 * �жϵ�ǰfile��ʶ���ļ���Ŀ¼�Ƿ���ʵ����
	 */
		System.out.println("�ļ��Ƿ���ڣ�"+exists);
		
		if(!file.exists()){
			//�����ļ�
			file.createNewFile();
			System.out.println("�ļ��������");
		}else {
			System.out.println("���ļ��Ѵ���");
		}
		

		
		
		
		
		
		
		
	}
}











