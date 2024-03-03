package coding02.test67뒤에서_5등_위로;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		int[] arr1 = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		result = sol.solution(arr1);
		System.out.println("15, 32, 38, 46, 56==" + Arrays.toString(result));
		
	}

}
