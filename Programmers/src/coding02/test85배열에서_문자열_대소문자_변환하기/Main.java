package coding02.test85배열에서_문자열_대소문자_변환하기;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String[] result;
		
		String[] arr1 = {"AAA","BBB","CCC","DDD"};
		result = sol.solution(arr1);
		System.out.println("[\"aaa\",\"BBB\",\"ccc\",\"DDD\"]==" + Arrays.toString(result));

		String[] arr2 = {"aBc","AbC"};
		result = sol.solution(arr2);
		System.out.println("[\"abc\",\"ABC\"]==" + Arrays.toString(result));

	}

}
