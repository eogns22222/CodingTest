
public class ThreeD {

	public static void main(String[] args) {
		
		// royal 아파트는 4개층 4개호 방 3개
		
		String[][][] royal = new String[4][4][3];
		System.out.println(royal.length+"층");
		System.out.println(royal[0].length+"호");
		System.out.println(royal[0][0].length+"개");
		
		// 2층 3호 2번 방은 "철수의 방"
		royal[2][3][2]="철수의 방";
		// 0층 0호 0번 방은 "영희의 방"
		royal[0][0][0]="영희의 방";
		
		// 나머지는 "공실" 로 표기하세요
		
		for (int i = 0; i < royal.length; i++) {
			for (int j = 0; j < royal[i].length; j++) {
				for (int k = 0; k < royal[i][j].length; k++){
					
					if (i==2 && j==3 && k==2) {
						System.out.println(i+"층"+j+"호"+k+"방 :"+"철수의 방");
						continue;
					}else if (i==0 && j==0 && k==0) {
						System.out.println(i+"층"+j+"호"+k+"방 :"+"영희의방 ");
						continue;
						
					}else {
						
					
					}
					royal[i][j][k] = "공실";
					System.out.println(i+"층"+j+"호"+k+"방 :"+royal[i][j][k]);
					
					
				}
			}
		}

					
					
					
				}
					
				
			
				
		
	}


