package coding03.test104가장_큰_수_찾기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {1, 8, 3};
		result = sol.solution(arr1);
		System.out.println("[8, 1]==" + Arrays.toString(result));

		int[] arr2 = {9, 10, 11, 8};
		result = sol.solution(arr2);
		System.out.println("[11, 2]==" + Arrays.toString(result));
		
	}

}
