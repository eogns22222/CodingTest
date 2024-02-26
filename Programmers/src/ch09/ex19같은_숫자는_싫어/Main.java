package ch09.ex19같은_숫자는_싫어;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr = {1,1,3,3,0,1,1};
		result = sol.solution(arr);
		System.out.println("1,3,0,1==" + Arrays.toString(result));
		
		int[] arr2 = {4,4,4,3,3};
		result = sol.solution(arr2);
		System.out.println("4,3==" +  Arrays.toString(result));
		
	}

}
