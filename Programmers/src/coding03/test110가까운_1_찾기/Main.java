package coding03.test110가까운_1_찾기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {0, 0, 0, 1};
		result = sol.solution(arr1, 1);
		System.out.println("3==" + result);

		int[] arr2 = {1, 0, 0, 1, 0, 0};
		result = sol.solution(arr2, 4);
		System.out.println("-1==" + result);
		
		int[] arr3 = {1, 1, 1, 1, 0};
		result = sol.solution(arr3, 3);
		System.out.println("3==" + result);
		
	}

}
