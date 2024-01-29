import java.util.Scanner;

public class BinarySearchEx01 {
	public static void main(String[] args) {

		//�迭 ���� �����Ͱ� ���ĵǾ� �־�� �Ѵ�.
		int[] data = {30,50,80,100,110,250,300,500};
				
		//�Է�
		System.out.print("ã���� �ϴ� ����>");
		Scanner scan = new Scanner(System.in);
		int find = scan.nextInt();  //300
		
		int low = 0; //�����ε���
		int high = 7; //���ε���
		
		int count = 0; //����Ƚ��
		//ó��
		while(low <= high) {
			count++; //����Ƚ�� ����
			
			int mid = (low + high) / 2;  //�߰��ε����� ���Ѵ�.
			
			if(find == data[mid]) { //ã������ 
				System.out.println("ã�����ϴ� ���� " + mid + "��° index�� ����.");
				System.out.println("����Ƚ��:" + count);
				return;
			}
			if(find > data[mid]) { //�߰���°���� ũ�� �ּҰ��� �̵�+1 ��°�� ����
				low = mid + 1;
			}else {
				high = mid - 1;
			}
			
		}
		
		System.out.println(find + "�� �������� �ʽ��ϴ�.");
		
		
		
	}
}
