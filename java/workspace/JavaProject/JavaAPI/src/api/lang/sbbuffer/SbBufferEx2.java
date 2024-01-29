package api.lang.sbbuffer;

public class SbBufferEx2 {

	public static void main(String[] args) {
		//문자열과 빠른문자열 속도 비교
		
		//String
		long start = System.currentTimeMillis();
		
		String str = "A";
		for(int i = 0; i < 300000; i++) {
			str += "A";
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("String덧셈:" + (end-start) * 0.001 );
		
		
		//StringBuffer
		long s = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer("A");
		
		for(int i = 0; i < 300000; i++) {
			sb.append("A");
		}
		
		long e = System.currentTimeMillis();
		
		System.out.println("스트링버퍼합계:" + (e - s) * 0.001  );

	}

}
