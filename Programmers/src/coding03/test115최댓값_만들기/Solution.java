package coding03.test115최댓값_만들기;

class Solution {
    public int solution(int[] numbers) {        
        int maxValue = Integer.MAX_VALUE * -1;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j<numbers.length; j++) {
                if(maxValue < numbers[i] * numbers[j] && i!=j) {
                    maxValue = numbers[i] * numbers[j];
                }
            }
        }

        return maxValue;
    }
}