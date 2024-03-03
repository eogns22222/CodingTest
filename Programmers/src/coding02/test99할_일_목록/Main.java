package coding02.test99할_일_목록;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String[] result;
		
		String[] arr1 = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] arr2 = {true, false, true, false};
		result = sol.solution(arr1, arr2);
		System.out.println("[\"practiceguitar\", \"studygraph\"]==" + Arrays.toString(result));
		
	}

}
