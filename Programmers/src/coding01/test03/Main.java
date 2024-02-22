package coding01.test03;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {4,3,2,1};
		result = sol.solution(arr1);
		System.out.println("[4,3,2]==" + Arrays.toString(result));
		
		int[] arr2 = {10};
		result = sol.solution(arr2);
		System.out.println("[-1]==" + Arrays.toString(result));
		
		
		
	}

}
