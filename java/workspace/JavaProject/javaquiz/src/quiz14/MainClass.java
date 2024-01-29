package quiz14;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		int [] arr1 = {21,22,3,42,51};
		char [] arr2 = {'a','b','c','d','e'};
		String [] arr3 = {"one","two","three","four","five"};
		//ArrayPrint ap = new ArrayPrint(); //(사용불가)
		System.out.println(ArrayPrint.toArray(arr1));
		System.out.println(ArrayPrint.toArray(arr2));
		System.out.println(ArrayPrint.toArray(arr3));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
	}

}
