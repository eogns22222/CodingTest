package coding02.test92배열의_원소만큼_추가하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {5, 1, 4};
		result = sol.solution(arr1);
		System.out.println("[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]==" + Arrays.toString(result));

		int[] arr2 = {6, 6};
		result = sol.solution(arr2);
		System.out.println("[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]==" + Arrays.toString(result));

		int[] arr3 = {1};
		result = sol.solution(arr3);
		System.out.println("[1]==" + Arrays.toString(result));

	}

}
