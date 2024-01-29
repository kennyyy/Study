package api.collection.list;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		//Vector<String> stack = new Stack<>();
		//List<String> list = new Stack<>();
		
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		
		//컬렉션의 값을 문자열 형태로 출력
		System.out.println(stack.toString());
		
		//컬렉션의 사이즈기능
		System.out.println(stack.size() );
		
		//컬렉션이 비었는지 확인하는 기능
		System.out.println(stack.isEmpty() );
		
		//삭제와 동시에 반환
		String v1 = stack.pop();
		String v2 = stack.pop();
		String v3 = stack.pop();
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//stack.pop(); // stack empty error
		
		
		
		
	}

}
