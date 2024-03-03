package coding02.test31배열_두배_만들기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;

		int[] arr1 = {1, 2, 3, 4, 5};
		result = sol.solution(arr1);
		System.out.println("2, 4, 6, 8, 10==" + Arrays.toString(result));
		
		int[] arr2 = {1, 2, 100, -99, 1, 2, 3};
		result = sol.solution(arr2);
		System.out.println("2, 4, 200, -198, 2, 4, 6==" + Arrays.toString(result));
		
		
	}

}
