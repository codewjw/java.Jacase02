package Day06;

import java.io.File;

/**
 * ��дһ�δ��룬Ҫ�����1+2+3...+100
 * ��������
 * ����δ����в��ظ�����for while�ؼ���
 * 
 * 
 * һ����ȥ��ˮ��1��Ǯ1ƿ��3��ƿ�ǿ��Ի�һƿ��2����ƿ���Ի�һƿ
 * ���� 20��Ǯ�������ƿˮ
 * 
 * @author �������ؼ
 *
 */
public class Test {
	public static void main(String[] args) {
		File file=new File("a");
		delete(file);
	}
	
	/**
	 * ��������File�����ʾ���ļ���Ŀ¼ɾ��
	 * @param file
	 */
	
	public static void delete(File file){
		if(file.isDirectory()){
			//����Ŀ¼����������ɾ��
			
			File[] listFiles = file.listFiles();
			for(File sub:listFiles){
				delete(sub);
			}
		}
		file.delete();
	}

}




