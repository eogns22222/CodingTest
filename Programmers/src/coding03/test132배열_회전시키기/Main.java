package coding03.test132배열_회전시키기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;

		int[] arr1 = {1, 2, 3};
		result = sol.solution(arr1, "right");
		System.out.println("[3, 1, 2]==" + Arrays.toString(result));
	
		int[] arr2 = {4, 455, 6, 4, -1, 45, 6};
		result = sol.solution(arr2, "left");
		System.out.println("[455, 6, 4, -1, 45, 6, 4]==" + Arrays.toString(result));
		
	}

}
