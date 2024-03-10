package coding03.test125특별한_이차원_배열1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[][] result;

		result = sol.solution(3);
		System.out.println("[[1, 0, 0], [0, 1, 0], [0, 0, 1]]==" + Arrays.deepToString(result));

		result = sol.solution(6);
		System.out.println("[[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]==" + Arrays.deepToString(result));
		
		result = sol.solution(1);
		System.out.println("[[1]]==" + Arrays.deepToString(result));
		
	}

}
