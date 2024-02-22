package ch09.ex15;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr = {1, 2, 3};
		result = sol.solution(arr);
		System.out.println("2==" + result);
		
		int[] arr2 = {3, 6, 2};
		result = sol.solution(arr2);
		System.out.println("2==" + result);
		
		int[] arr3 = {199, 72, 222};
		result = sol.solution(arr3);
		System.out.println("1==" + result);
		
		
	}

}
