package �˻��˰���;

import java.util.Scanner;

/*
 * ���ڿ� �˻� �˰��� ����
 */

public class SequentailEx02 {
	public static void main(String[] args) {
		String[] name = {"����ö","�輱��","�̰���","�����","����ȣ"};
		int i;
		String find;
		
		System.out.print("ã�����ϴ� �̸���? ");
		Scanner scan = new Scanner(System.in);
		find = scan.next();
		
		//���� �˻� �˰��� ����
		for(i=0; i<name.length; i++) {
			if(find.equals(name[i])) {
				System.out.println("ã���� �ϴ� �̸��� " + name[i] + "�Դϴ�.");
				break;	//[����]
			}
		}
		if(i == name.length) {
			System.out.println("ã���� �ϴ� �̸��� �������� �ʽ��ϴ�.");
		}
	}
}
