package coding03.test103x_사이의_개수;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		result = sol.solution("oxooxoxxox");
		System.out.println("[1, 2, 1, 0, 1, 0]==" + Arrays.toString(result));
	
		result = sol.solution("xabcxdefxghi");
		System.out.println("[0, 3, 3, 3]==" + Arrays.toString(result));
		
	}

}
