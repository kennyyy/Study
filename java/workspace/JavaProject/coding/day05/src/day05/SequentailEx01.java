package �˻��˰���;

import java.util.Scanner;

/*
 * ���� �˻� �˰���
 */

public class SequentailEx01 {
	public static void main(String[] args) {
		//�迭 => �ڷᱸ�� �غ�
		int[] data = {30,10,50,40,20,70,90,25,120,150};
		//int n = 10;	//�˻� ��� ������ ����
		int i, find;
		
		//�Է�
		System.out.print("ã���� �ϴ� ����? ");
		Scanner scan = new Scanner(System.in);
		find = scan.nextInt();
		
		//ó�� => ���� �˻� �˰��� ����
		for(i=0; i<data.length; i++) {
			if(find == data[i]) {
				System.out.println("ã���� �ϴ� ���� " + data[i] + "�Դϴ�.");
				break;	//[����]
			}
		}
		//�迭�� ���� �����͸� �䱸���� �� �ذ� ���
		if(i == data.length) {
			System.out.println(find + "�� ã�� �� �����ϴ�.");
		}		
	}
}







