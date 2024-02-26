package coding01.test14;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		long[] result;
		
		result = sol.solution(2,	 5);
		System.out.println("[2,4,6,8,10]==" + Arrays.toString(result));
		
		result = sol.solution(4, 3);
		System.out.println("[4,8,12]==" + Arrays.toString(result));
		
		result = sol.solution(-4, 2);
		System.out.println("[-4, -8]==" + Arrays.toString(result));
		
		
	}

}
