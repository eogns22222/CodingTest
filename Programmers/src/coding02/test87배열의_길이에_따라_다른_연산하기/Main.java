package coding02.test87배열의_길이에_따라_다른_연산하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {49, 12, 100, 276, 3};
		result = sol.solution(arr1, 27);
		System.out.println("[76, 12, 127, 276, 60]==" + Arrays.toString(result));

		int[] arr2 = {444, 555, 666, 777};
		result = sol.solution(arr2, 100);
		System.out.println("[444, 655, 666, 877]==" + Arrays.toString(result));

	}

}
