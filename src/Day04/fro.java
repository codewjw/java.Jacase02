package Day04;

/**
 * ѡ������ ��ð������ѭ�������٣���������
 * 
 * @author �������ؼ
 *
 */
public class fro {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 10, 2, 9, 4 };
		int t;
		int cont = 0;
		// ѡ������
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;

				}
				cont++;

			}
			
		}
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		System.out.println(cont);

		
		System.out.println("---------------------------------");
		// ð������
		int cont1=0;
		int[] arrs = { 1, 5, 10, 2, 9, 4 };
		for (int x = 0; x < arrs.length - 1;x++) {
			for (int y = 0; y < arrs.length-1-x;y++) {
				if (arrs[y] < arrs[y+1]) {
					t = arrs[y];
					arrs[y] = arrs[y+1];
					arrs[y+1] = t;

				}
				cont1++;
			}
			
		}
		for (int i = 0; i < arrs.length; i++)
			System.out.println(arr[i]);
		
		System.out.println(cont1);
	}

}
