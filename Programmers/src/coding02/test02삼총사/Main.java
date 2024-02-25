package coding02.test02삼총사;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr = {-2, 3, 0, 2, -5};
		result = sol.solution(arr);
		System.out.println("2==" + result);
		
		int[] arr2 = {-3, -2, -1, 0, 1, 2, 3};
		result = sol.solution(arr2);
		System.out.println("5==" + result);
		
		int[] arr3 = {-1, 1, -1, 1};
		result = sol.solution(arr3);
		System.out.println("0==" + result);
		
		
	}

}
