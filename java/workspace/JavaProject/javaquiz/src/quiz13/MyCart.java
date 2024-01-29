package quiz13;

import java.util.Arrays;

public class MyCart {
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0;
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
	}
	
	/*
	 * 3. buy(모든 상품을 받도록 선언)
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고  add(상품) 메서드를 호출
     */ 
	void buy(Product p) {
		if(this.money < p.price) {
			System.out.println("금액 부족");
		}else {
			money -= p.price;
			add(p);

		}
			
	}

	/*
	 * 4. add(모든 상품을 받도록 선언)
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 */
	private void add(Product p) {
		if(cart.length <= i) {
			Product[] newCart = Arrays.copyOf(cart, cart.length * 2);
			cart = newCart;
			newCart = null;
		}
		cart[i] = p;
		i++;
	}
	
	void info() {
		System.out.println("[카트에 담긴 물건의 목록]");
		
		for(Product p : cart) {
			if(p == null) {
				break;
			}
			System.out.print(p.name + " ");
			
		}
		System.out.println("\n남은 금액 : " + money + "원");
	}
	
	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	

	
}
