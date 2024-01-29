package api.generic.multi;

public class ABC<A, B> {
	//멀티제네릭 (A, B를 타입으로 사용)
	private A key;
	private B value;
	
	public void setData(A key, B value) {
		this.key = key;
		this.value = value;
	}
	
	public B getValue(A key) {
		if(this.key == key) {
			return value;
		}
		return null;
	}
	
	public static void main(String[] args) {
		ABC<Integer, Object> abc = new ABC<>();
		abc.setData(1, "홍길동");
		System.out.println(abc.getValue(1));
		System.out.println(abc.getValue(2));
	}
	
	
}
