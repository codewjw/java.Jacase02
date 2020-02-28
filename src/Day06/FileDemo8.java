package Day06;

import java.io.File;
import java.io.FileFilter;

/**
 * File�ṩ��һ�����ڵ�listFiles����
 * ���Է������ʾ��Ŀ¼������ָ��������Ҫ�������
 * 
 * 
 * File[] listFile(FileFilter file)
 * 
 * java.io.FileFilter  �ļ�������
 * @author �������ؼ
 *
 */
public class FileDemo8 {
	public static void main(String[] args) {
		/**
		 * ��ȡ��ǰĿ¼�������ļ�
		 */
		File file=new File(".");
		
		File[] subs=file.listFiles(new FileFilter() {
			/**
			 * ������Ҫ�������дaccept���������÷���������
			 * �Ƕ��������Fil����Ĺ�������Ϊ������File
			 * ���������Ҫ���򷽷�����true
			 */
			@Override
			public boolean accept(File pathname) {
				System.out.println("���ڹ���"+pathname.getName());
				return pathname.isFile();
				
			}
		});
		
		for (File sub : subs) {
			System.out.println(sub);
		}
		
		
		
		
	}
}




