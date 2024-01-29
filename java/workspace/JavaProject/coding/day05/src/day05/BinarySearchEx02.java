
import java.util.Scanner;

/*
 * �̺� �˻� �˰��� => ���ڿ� �˻�
 */

public class BinarySearchEx02 {
	public static void main(String[] args) {
		
		//�����ʿ�
		String[] name = {"�輱��","������","����ȣ","������","����ö","����ȣ"};
		
		System.out.print("ã�����ϴ� �̸���? ");
		Scanner scan = new Scanner(System.in);
		String find = scan.next();
	

		int low = 0;
		int high = 5;
		
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(find.equals(name[mid])) {
				System.out.println("ã�����ϴ� �̸��� " + name[mid] + "�̴�.");
				return;  //���α׷� ���� ����!
			}
			
			//��Ȯ�� ��ġ�ϸ� 0, 
			//���ڰ� ���ԵǾ������� ���ڿ��� ������ ���� ����
			//�񱳰� �Ұ����� ���� ������ �� ���ڿ��� �ƽ�Ű���� �������� ���ϸ� ����
			//�ƽ�Ű�� ������ ��󺸴� ���ʿ� �����ϴ� ���ڶ�� �ǹ�
			//�ƽ�Ű�� ������� ��󺸴� ���ʿ� �����ϴ� ���ڶ�� �ǹ�
			System.out.println(find.compareTo(name[mid])); 
			if(find.compareTo(name[mid]) > 0) { 
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		//System.out.println(find + "�� �������� �ʽ��ϴ�.");
		
		
	}
	
}
