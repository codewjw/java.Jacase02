package Day04;


/**
 * ��ǿ��forѭ��
 * �ֳ�Ϊ����ѭ���� for each
 * ��ѭ����jdk1.5֮���Ƴ������ԣ������Ǳ������Ϲ�����
 */
public class NewForDemo1 {
	public static void main(String[] args) {
		String[] array={"one","two","three","four","five"};

        for (int i = 0; i <array.length ; i++) {
            String str=array[i];
            System.out.println("��"+i+"��Ԫ���ǣ�"+str);
        }

        for ( String str:array) {//���Ͽ�  �ı�Ϊ��ͳforѭ���﷨
            /**
             * �������Ὣ��ѭ����������ı�Ϊʹ�ô�ͳѭ������
             * ����
             */
            System.out.println(str);
        }
	}
}
