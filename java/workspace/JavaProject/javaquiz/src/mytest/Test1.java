package mytest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Test1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int a  = Integer.parseInt(str[0]);
		int b  = Integer.parseInt(str[1]);
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		System.out.println(a + " " + b);
		System.out.println(c + " " + d);

	}

}
