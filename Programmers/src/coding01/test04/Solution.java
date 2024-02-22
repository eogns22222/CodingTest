package coding01.test04;

// 자릿수 더하기
public class Solution {
	public int solution(int n) {
		int answer = 0;

		String str = Integer.toString(n);
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			String str2 = String.valueOf(ch[i]);
			int var = Integer.parseInt(str2);
			answer += var;
			System.out.println(answer);
		}

		return answer;
	}
}
