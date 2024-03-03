package coding02.test49마지막_두_원소;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {2, 1, 6};
		result = sol.solution(arr1);
		System.out.println("2, 1, 6, 5==" + Arrays.toString(result));
		
		int[] arr2 = {5, 2, 1, 7, 5};
		result = sol.solution(arr2);
		System.out.println("5, 2, 1, 7, 5, 10==" + Arrays.toString(result));
		
		
	}

}
