package Day06;

import java.io.File;

/**
 * �����༶Ŀ¼
 * @author �������ؼ
 *
 */
public class FileDemo5 {
	public static void main(String[] args) {
		/**
		 * �ڵ�ǰĿ¼�´���a/b/c/d/e/fĿ¼
		 */

		File file = new File(
				"."+File.separator+
				"a"+File.separator+
				"b"+File.separator+
				"c"+File.separator+
				"d"+File.separator+
				"f"
			);
		if (!file.exists()) {
			/**
			 * mkdifs�Ὣ���в����ڵĸ�Ŀ¼һͬ��������
			 */
			file.mkdirs();
			System.out.println("����Ŀ¼���");
		}else {
			System.out.println("��Ŀ¼�Դ���");
		}
		
		
	}
}






