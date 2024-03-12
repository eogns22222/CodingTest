package coding03.test120최소직사각형;

//import java.util.Arrays;
//
//class Solution {
//    public int solution(int[][] sizes) {
//        int answer = 0;
//        int max2 = sizes[0][1];
//        int max3 = sizes[0][0];
//        
//        for (int i = 0; i < sizes.length; i++) {
//        	int max = sizes[i][0];
//			for (int j = 0; j < sizes[i].length; j++) {
//				int temp = 0;
//				if(max < sizes[i][j]) {
//					temp = sizes[i][j];
//					sizes[i][j] = max; 
//					sizes[i][0] = temp;
//				}
//			}
//		}
//        
//        for (int i = 0; i < sizes.length; i++) {
//			for (int j = 0; j < sizes[i].length; j++) {
//				if(max2 < sizes[i][1]) {
//					max2 = sizes[i][1];
//				}
//			}
//			if(max3 < sizes[i][0]) {
//				max3 = sizes[i][0];
//			}
//		}
//        
//        System.out.println(Arrays.deepToString(sizes));
//        System.out.println(max2);
//        System.out.println(max3);
//        
//        answer = max2 * max3;
//        
//        return answer;
//    }
//}

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0; // 가장 큰 가로 값을 저장
        int min =0; // 가장 큰 세로 값을 저장
        
        for (int i = 0; i < sizes.length; i++) {
        	// 큰 값을 가로에 작은 값을 세로로 생각
        	int max2 = 0; // 층 마다 비교값보다 큰 값을 가로 값 저장
        	int min2 = 0; // 층 마다 비교값보다 작은 값을 세로 값 저장
        	
			if(sizes[i][0] > sizes[i][1]) { // 어차피 값은 가로 세로 두개 이기에 오른쪽 값은 0, 1 로 정해준다.
				max2 = sizes[i][0];
				min2 = sizes[i][1];
			}else {
				max2 = sizes[i][1];
				min2 = sizes[i][0];
			}
			
			if(max < max2) { // 가로 값 중 가장 큰 값 찾기
				max = max2;
			}
			if(min < min2) { // 세로 값 중 가장 큰 값 찾기
				min = min2;
			}
			
		}
        
        answer = max * min;
        
        return answer;
    }
}






















