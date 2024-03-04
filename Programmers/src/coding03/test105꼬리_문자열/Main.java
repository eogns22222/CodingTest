package coding03.test105꼬리_문자열;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		String[] arr1 = {"abc", "def", "ghi"};
		result = sol.solution(arr1, "ef");
		System.out.println("abcghi==" + result);

		String[] arr2 = {"abc", "bbc", "cbc"};
		result = sol.solution(arr2, "c");
		System.out.println("==" + result);
		
	}

}
