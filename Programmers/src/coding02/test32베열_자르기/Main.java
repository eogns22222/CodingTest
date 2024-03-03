package coding02.test32베열_자르기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;

		int[] arr1 = {1, 2, 3, 4, 5};
		result = sol.solution(arr1, 1, 3);
		System.out.println("2, 3, 4==" + Arrays.toString(result));
		
		int[] arr2 = {1, 3, 5};
		result = sol.solution(arr2, 1, 2);
		System.out.println("3, 5==" + Arrays.toString(result));
		
		
	}

}
