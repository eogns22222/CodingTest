package coding03.test107ab_제거하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String[] result;
		
		String[] arr1 = {"and","notad","abcd"};
		result = sol.solution(arr1);
		System.out.println("\"and\",\"abcd\"==" + Arrays.toString(result));

		String[] arr2 = {"there","are","no","a","ds"};
		result = sol.solution(arr2);
		System.out.println("\"there\",\"are\",\"no\",\"a\",\"ds\"==" + Arrays.toString(result));
		
	}

}
