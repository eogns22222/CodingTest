package coding02.test71길이에_따른_연산;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
		result = sol.solution(arr1);
		System.out.println("51==" + result);

		int[] arr2 = {2, 3, 4, 5};
		result = sol.solution(arr2);
		System.out.println("120==" + result);
		
	}

}
