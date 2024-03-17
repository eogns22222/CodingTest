package coding04.test140수열과_구간_쿼리1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;

		int[] arr1 = {0, 1, 2, 3, 4};
		int[][] arr2 = {
			{0, 1},{1, 2},{2, 3}
		};
		result = sol.solution(arr1, arr2);
		System.out.println("[1, 3, 4, 4, 4]==" + Arrays.toString(result));
		
	}

}
