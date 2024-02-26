package coding02.test05평균구하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		double result;
		
		int[] arr = {1,2,3,4};
		result = sol.solution(arr);
		System.out.println("2.5==" + result);
		
		int[] arr2 = {5,5};
		result = sol.solution(arr2);
		System.out.println("5==" + result);
		
		
	}

}
