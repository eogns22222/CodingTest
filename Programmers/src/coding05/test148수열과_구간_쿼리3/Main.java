package coding05.test148수열과_구간_쿼리3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;

		int[] arr1 = {0, 1, 2, 3, 4};
		int[][] arr2 = {
				{0, 3},{1, 2},{1, 4}
		};
		result = sol.solution(arr1, arr2);
		System.out.println("[3, 4, 1, 0, 2]==" + Arrays.toString(result));
		
	}

}
