package coding02.test96n개_간격의_원소들;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {4, 2, 6, 1, 7, 6};
		result = sol.solution(arr1, 2);
		System.out.println("[4, 6, 7]==" + Arrays.toString(result));

		int[] arr2 = {4, 2, 6, 1, 7, 6};
		result = sol.solution(arr2, 4);
		System.out.println("[4, 7]==" + Arrays.toString(result));
		
	}

}
