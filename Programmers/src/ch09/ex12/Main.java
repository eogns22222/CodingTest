package ch09.ex12;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		result = sol.solution(10, 3);
		System.out.println("[3, 6, 9]==" + Arrays.toString(result));
		
		result = sol.solution(15, 5);
		System.out.println("[5, 10, 15]==" + Arrays.toString(result));
		
	}

}
