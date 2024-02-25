package coding02.test18행렬의_덧셈;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[][] result;
		
		int[][] arr1 = {{1,2}, {2,3}};
		int[][] arr2 = {{3,4}, {5,6}};
		result = sol.solution(arr1, arr2);
		System.out.println("[4,6],[7,9]==" + Arrays.deepToString(result));
		
		int[][] arr3 = {{1}, {2}};
		int[][] arr4 = {{3}, {4}};
		result = sol.solution(arr3, arr4);
		System.out.println("[4],[6]==" + Arrays.deepToString(result));
		
		
	}

}
