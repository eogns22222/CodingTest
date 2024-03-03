package coding02.test31배열_두배_만들기;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
			System.out.println(answer[i]);
		}
        
        return answer;
    }
}