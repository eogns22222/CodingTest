package coding02.test32베열_자르기;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
			if(i >= num1 && i <= num2) {
				answer[sum] = numbers[i];
				sum++;
			}
			
		}
        
        
        return answer;
    }
}