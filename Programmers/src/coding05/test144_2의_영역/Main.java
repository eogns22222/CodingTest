package coding05.test144_2의_영역;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;

		int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
		result = sol.solution(arr1);
		System.out.println("[2, 1, 4, 5, 2]==" + Arrays.toString(result));
		
		int[] arr2 = {1, 2, 1};
		result = sol.solution(arr2);
		System.out.println("[2]==" + Arrays.toString(result));
		
		int[] arr3 = {1, 1, 1};
		result = sol.solution(arr3);
		System.out.println("[-1]==" + Arrays.toString(result));
		
		int[] arr4 = {1, 2, 1, 2, 1, 10, 2, 1};
		result = sol.solution(arr4);
		System.out.println("[2, 1, 2, 1, 10, 2]==" + Arrays.toString(result));
		
	}

}
