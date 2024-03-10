package coding03.test122문자열_내_마음대로_정렬하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String[] result;

		String[] arr1 = {"sun", "bed", "car"};
		result = sol.solution(arr1, 1);
		System.out.println("[\"car\", \"bed\", \"sun\"]==" + Arrays.toString(result));

		String[] arr2 = {"abce", "abcd", "cdx"};
		result = sol.solution(arr2, 2);
		System.out.println("[\"abcd\", \"abce\", \"cdx\"]==" + Arrays.toString(result));
		
	}

}
