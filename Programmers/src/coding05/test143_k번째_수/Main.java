package coding05.test143_k번째_수;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;

		int[] arr1 = {1, 5, 2, 6, 3, 7, 4};
		int[][] arr2 = {
				{2, 5, 3}, {4, 4, 1}, {1, 7, 3}
		};
		result = sol.solution(arr1, arr2);
		System.out.println("[5, 6, 3]==" + Arrays.toString(result));
		
	}

}
