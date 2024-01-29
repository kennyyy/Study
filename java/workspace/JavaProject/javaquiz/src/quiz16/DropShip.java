package quiz16;

import java.util.Arrays;

public class DropShip extends Unit{
	//유닛을 담을 배열
	private Unit[] arr = new Unit[8];
	private int index_arr = 0;
	
	private static int armor = 1;
	
	public DropShip(int x, int y) {
		super(x, y, 150);
	}

	@Override
	public void location() {
		System.out.println("드랍쉽 현재 위치 : " + this.getX() + ", " + this.getY());
	}

	@Override
	public void move(int x, int y) {
		//수송선이 이동하면, 수송선 x, y위치로 모든 유닛의 위치를 변경.
		
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
		System.out.println("드랍쉽 위치 이동!");
		location();
		
		for(Unit u : arr) {
			u.setX(u.getX() + x);
			u.setY(u.getY() + y);
			u.location();
		}
	}
	
	//2.유닛 탑승기능 void ride(Unit unit)
	
	//1.탱크는 배열의 크기를 4칸씩 사용, 마린은 배열의 크기를 1칸씩 사용.
	//2.배열이 전부차거나, 해당 유닛이 탈 수 있는 공간이 없으면 "드랍쉽에 공간이 부족합니다." 출력
	//3.수송선에 탑승한 유닛을 가로로 출력
	//4.main에 확인하기
	
	public void ride(Unit unit) {
		if(index_arr > 7) {
			System.out.println("드랍쉽에 공간이 부족합니다.");
			return;
		}
		if(unit instanceof Marine) {
			arr[index_arr++] = unit;
			
		}else if(unit instanceof Tank) {
			arr[index_arr] = unit;
			index_arr+=4;
		}
		
		System.out.println(Arrays.toString(arr));
				
		}
		
}
	



