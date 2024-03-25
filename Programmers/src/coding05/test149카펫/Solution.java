package coding05.test149카펫;

//class Solution {
//    public int[] solution(int brown, int yellow) {
//        int[] answer = new int[2];
//        int x = 0;
//        int y = 0;
//        int x2 = 0;
//        int y2 = 0;
//        
//        // 내가 푼 카펫 공식
//        // 테두리 = (x * 2) + ((y - 2) * 2) = 24
//        // 가운데 = (x - 2) + (y - 2) = 24
//        // 가로 = x = 8
//        // 세로 = y = 6
//        
//        // 가운데 카펫의 가로 세로 값부터 구해본다.
//        for (int i = 1; i <= yellow; i++) { // 가운데 카펫 갯수만큼 돌리고
//        	if(yellow % i == 0) { // 가운데 카펫 갯수의 약수를 구한다.
//        		x = i;
//        	}
//        	
//			for (int j = 1; j <= yellow; j++) { // 가운데 카펫 갯수만큼 한번 더 돌려서
//				
//				if(yellow % j == 0) { // 가운데 카펫의 약수를 구한다.
//					y = j;
//				}
//				
//				// 약수 * 약수의 값이 yellow 와 같다면
//				// (x - 2) + (y - 2) = 24 이 공식으로 구해진 것이기 때문에
//				if(x * y == yellow) { 
//					// 2씩 더해준 값이 가로 세로 길이 후보가 된다.
//					x = x + 2; 
//					y = y + 2;
//					
//					// 그 값을 (x * 2) + ((y - 2) * 2) = 24 공식을 사용해 brown 과 같다면
//					if((x * 2) + ((y - 2) * 2) == brown) {
//						// 진짜 가로 세로 값이 나온다.
//						x2 = x;
//						y2 = y;
//					}
//					
//				}
//			}
//		}
//        
//        // 가로의 값은 세로의 값보다 길거나 같다고 했으니 비교해준다.
//        if(x2 > y2) {
//        	answer[0] = x2;
//        	answer[1] = y2;
//        }else {
//        	answer[0] = y2;
//        	answer[1] = x2;
//        }
//        
//        
//        
//        return answer;
//    }
//}

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        int x2 = 0;
        int y2 = 0;
        
        // 내가 푼 카펫 공식
        // 테두리 = (x * 2) + ((y - 2) * 2) = 24
        // 가운데 = (x - 2) + (y - 2) = 24
        // 가로 = x = 8
        // 세로 = y = 6
        
        // 가운데 카펫의 가로 세로 값부터 구해본다.
        for (int i = 1; i <= yellow; i++) { // 가운데 카펫 갯수만큼 돌리고
        	if(yellow % i == 0) { // 가운데 카펫 갯수의 약수를 구한다.
        		x = i;
        	}
        	
        	// 약수 x 로 yellow 를 나눈 값 y
        	y = yellow / x;
        	
        	// 그 둘을 곱했을 때 yellow 와 같다면
        	// (x - 2) + (y - 2) = 24 이 공식이 성립되기 때문에
        	if(y * x == yellow) {
        		// 2씩 더해준 값이 가로 세로 길이 후보가 된다.
        		x = x + 2; 
				y = y + 2;
				
				// 그 값을 (x * 2) + ((y - 2) * 2) = 24 공식을 사용해 brown 과 같다면
				if((x * 2) + ((y - 2) * 2) == brown) {
					// 진짜 가로 세로 값이 나온다.
					x2 = x;
					y2 = y;
				}
        	}
        	
		}
        
        // 가로의 값은 세로의 값보다 길거나 같다고 했으니 비교해준다.
        if(x2 > y2) {
        	answer[0] = x2;
        	answer[1] = y2;
        }else {
        	answer[0] = y2;
        	answer[1] = x2;
        }
        
        
        
        return answer;
    }
}
