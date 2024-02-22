package coding01.test02;

// 가운데 글자 가져오기
class Solution {
	public String solution(String s) {
		String answer = "";

		char[] ch = s.toCharArray();
		
		if (s.length() % 2 == 0) {
			answer += ch[(s.length() / 2) -1];
			answer += ch[(s.length() / 2)];
		} else {
			answer += ch[(int)(s.length() / 2)];
		}

		return answer;
	}
}