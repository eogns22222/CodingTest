package coding03.test134문자열_잘라서_정렬하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String[] result;

		result = sol.solution("axbxcxdx");
		System.out.println("[\"a\",\"b\",\"c\",\"d\"]==" + Arrays.toString(result));

		result = sol.solution("dxccxbbbxaaaa");
		System.out.println("[\"aaaa\",\"bbb\",\"cc\",\"d\"]==" + Arrays.toString(result));
		
	}

}
