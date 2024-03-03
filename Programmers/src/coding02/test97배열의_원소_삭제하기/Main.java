package coding02.test97배열의_원소_삭제하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {293, 1000, 395, 678, 94};
		int[] arr2 = {94, 777, 104, 1000, 1, 12};
		result = sol.solution(arr1, arr2);
		System.out.println("[293, 395, 678]==" + Arrays.toString(result));

		int[] arr3 = {110, 66, 439, 785, 1};
		int[] arr4 = {377, 823, 119, 43};
		result = sol.solution(arr3, arr4);
		System.out.println("[110, 66, 439, 785, 1]==" + Arrays.toString(result));
		
	}

}
