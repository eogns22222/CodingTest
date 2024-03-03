package coding02.test94공백으로_구분하기2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String[] result;
		
		result = sol.solution(" i    love  you");
		System.out.println("[\"i\", \"love\", \"you\"]==" + Arrays.toString(result));

		result = sol.solution("    programmers  ");
		System.out.println("[\"programmers\"]==" + Arrays.toString(result));

	}

}
