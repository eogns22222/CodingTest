package coding02.test62홀짝_구분하기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " is even");
		}else {
			System.out.println(n + " is odd");
			
		}
	}

}
