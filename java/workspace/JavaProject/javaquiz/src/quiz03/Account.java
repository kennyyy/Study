package quiz03;
/*
1. 멤버 변수- 예금주이름(name : String), 비밀번호(password : String), 잔액(balance: int) 로 선언하세요.

2. 생성자 - 3가지 멤버 변수를 모두 매개값으로 받아 초기화하는 생성자를 선언하세요.


3. 메서드 - 
				입금기능 메서드(deposit : void),  -잔액누적
				출금기능 메서드(withDraw: void),  -잔액차감
				잔액 조회 메서드(getbalance: int) -잔액리턴
*/
public class Account {
	String name;
	String password;
	int balance;
	
	Account(String aName,String aPassword, int aBalance){
		name = aName;
		password = aPassword;
		balance = aBalance;
		System.out.println(name + "님의 초기 계좌 잔액 : " + balance + "원 입니다.\n");
	}
	
	void deposit(int money) {
		balance += money;
		System.out.println(name + "님의 계좌에 " + money + "원이 출금완료!");
	}
	
	void withDraw(int money) {
		if(balance < money) {
			System.out.println("잔액 부족");
			return;
		}
		balance -= money;
		System.out.println(name + "님의 계좌에 " + money + "원이 출금완료!");
		
	}
	int getbalance() {
		System.out.println(name + "님의 현재 계좌 잔액 : " + balance + "원 입니다.\n");
		return balance;
	}
	
	public static void main(String[] args) {
		Account acc = new Account("홍길동", "1234", 1000);
		
		acc.deposit(2000);
		acc.deposit(3000);
		acc.getbalance();
	
		acc.withDraw(1000);
		acc.withDraw(2000);
		acc.getbalance();
		
	}

}
