package coding02.test42짝수는_싫어요;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		result = sol.solution(10);
		System.out.println("1, 3, 5, 7, 9==" + Arrays.toString(result));

		result = sol.solution(15);
		System.out.println("1, 3, 5, 7, 9, 11, 13, 15==" + Arrays.toString(result));
		
	}

}
