package coding02.test50n의_배수_고르기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		result = sol.solution(3, arr1);
		System.out.println("6, 9, 12==" + Arrays.toString(result));
		
		int[] arr2 = {1, 9, 3, 10, 13, 5};
		result = sol.solution(5, arr2);
		System.out.println("10, 5==" + Arrays.toString(result));
		
		int[] arr3 = {2, 100, 120, 600, 12, 12};
		result = sol.solution(12, arr3);
		System.out.println("120, 600, 12, 12==" + Arrays.toString(result));
		
		
	}

}
