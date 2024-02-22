package ch09.ex08;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {5, 9, 7, 10};
		result = sol.solution(arr1,5);
		System.out.println("[5, 10]==" + Arrays.toString(result));
		
		int[] arr2 = {2, 36, 1, 3};
		result = sol.solution(arr2,1);
		System.out.println("[1, 2, 3, 36]==" + Arrays.toString(result));
		
		int[] arr3 = {3,2,6};
		result = sol.solution(arr3,10);
		System.out.println("[-1]==" + Arrays.toString(result));
		
		
	}

}
