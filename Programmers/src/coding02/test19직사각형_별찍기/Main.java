package coding02.test19직사각형_별찍기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i = 0; i < b; i++) {
			System.out.println("*".repeat(a));
		}

	}

}
