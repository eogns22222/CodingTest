package coding02.test74조건에_맞게_수열_변환하기1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {1, 2, 3, 100, 99, 98};
		result = sol.solution(arr1);
		System.out.println("2, 2, 6, 50, 99, 49==" + Arrays.toString(result));
		
		
	}

}
