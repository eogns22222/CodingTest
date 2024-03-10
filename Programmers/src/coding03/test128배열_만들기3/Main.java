package coding03.test128배열_만들기3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;

		int[] arr1 = {1, 2, 3, 4, 5};
		int[][] arr2 = {{1, 3}, {0, 4}};
		result = sol.solution(arr1, arr2);
		System.out.println("[2, 3, 4, 1, 2, 3, 4, 5]==" + Arrays.toString(result));
		
	}

}
