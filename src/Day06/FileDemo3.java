package Day06;

import java.io.File;

/**
 * ɾ���ļ�
 * @author �������ؼ
 *
 */
public class FileDemo3 {
	public static void main(String[] args) {
		/**
		 * ����ǰĿ¼�ļ���test.txt �ļ�ɾ��
		 */
		File file = new File("test.txt");
		// ͬ��Ŀ¼��
		//"."+File.separator+"test.txt"
		
		if (file.exists()) {
			file.delete();
			System.out.println("ɾ�����");
		}else {
			System.out.println("���ļ�������");
		}

	}
}
