package coding02.test95_5명씩;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String[] result;
		
		String[] arr1 = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		result = sol.solution(arr1);
		System.out.println("[\"nami\", \"vex\"]==" + Arrays.toString(result));
		
	}

}
