package coding02.test80정수_찾기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {1, 2, 3, 4, 5};
		result = sol.solution(arr1, 3);
		System.out.println("1==" + result);

		int[] arr2 = {15, 98, 23, 2, 15};
		result = sol.solution(arr2, 20);
		System.out.println("0==" + result);

	}

}
