package coding02.test65n보다_커질_때까지_더하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {34, 5, 71, 29, 100, 34};
		result = sol.solution(arr1, 123);
		System.out.println("139==" + result);
		
		int[] arr2 = {58, 44, 27, 10, 100};
		result = sol.solution(arr2, 139);
		System.out.println("239==" + result);
		
	}

}
