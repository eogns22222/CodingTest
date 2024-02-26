package coding02.test16내적;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {-3,-1,0,2};
		result = sol.solution(arr1, arr2);
		System.out.println("3==" +result);
		
		int[] arr3 = {-1,0,1};
		int[] arr4 = {1,0,-1};
		result = sol.solution(arr3, arr4);
		System.out.println("-2==" +result);
		
		
	}

}
