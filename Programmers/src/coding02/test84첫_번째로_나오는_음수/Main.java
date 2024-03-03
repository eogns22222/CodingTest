package coding02.test84첫_번째로_나오는_음수;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr1 = {12, 4, 15, 46, 38, -2, 15};
		result = sol.solution(arr1);
		System.out.println("5==" + result);

		int[] arr2 = {13, 22, 53, 24, 15, 6};
		result = sol.solution(arr2);
		System.out.println("-1==" + result);

	}

}
