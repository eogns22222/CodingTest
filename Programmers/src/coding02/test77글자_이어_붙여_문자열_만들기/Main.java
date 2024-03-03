package coding02.test77글자_이어_붙여_문자열_만들기;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result;
		
		int[] arr1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		result = sol.solution("cvsgiorszzzmrpaqpe", arr1);
		System.out.println("programmers==" + result);

		int[] arr2 = {1, 2, 0, 0, 3};
		result = sol.solution("zpiaz", arr2);
		System.out.println("pizza==" + result);

	}

}
