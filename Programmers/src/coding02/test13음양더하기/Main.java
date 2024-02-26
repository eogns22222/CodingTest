package coding02.test13음양더하기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int result;
		
		int[] arr = {4,7,12};
		boolean[] arr2 = {true,false,true};
		result = sol.solution(arr, arr2);
		System.out.println("9==" +result);
		
		int[] arr3 = {1,2,3};
		boolean[] arr4 = {false,false,true};
		result = sol.solution(arr3, arr4);
		System.out.println("0==" +result);
		
		
		
	}

}
