package coding02.test63n번째_원소까지;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {2, 1, 6};
		result = sol.solution(arr1, 1);
		System.out.println("2==" + Arrays.toString(result));
		
		int[] arr2 = {5, 2, 1, 7, 5};
		result = sol.solution(arr2, 3);
		System.out.println("5, 2, 1==" + Arrays.toString(result));
		
	}

}
