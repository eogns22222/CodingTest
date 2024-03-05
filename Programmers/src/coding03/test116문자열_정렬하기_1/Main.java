package coding03.test116문자열_정렬하기_1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] result;
		
		result = sol.solution("hi12392");
		System.out.println("[1, 2, 2, 3, 9]==" + Arrays.toString(result));

		result = sol.solution("p2o4i8gj2");
		System.out.println("[2, 2, 4, 8]==" + Arrays.toString(result));
		
		result = sol.solution("abcde0");
		System.out.println("[0]==" + Arrays.toString(result));
		
	}

}
