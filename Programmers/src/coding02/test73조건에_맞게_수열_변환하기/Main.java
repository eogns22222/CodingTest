package coding02.test73조건에_맞게_수열_변환하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {1, 2, 3, 100, 99, 98};
		result = sol.solution(arr1, 3);
		System.out.println("3, 6, 9, 300, 297, 294==" + Arrays.toString(result));
		
		int[] arr2 = {1, 2, 3, 100, 99, 98};
		result = sol.solution(arr2, 2);
		System.out.println("3, 4, 5, 102, 101, 100==" + Arrays.toString(result));
		
	}

}
