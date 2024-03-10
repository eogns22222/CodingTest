package coding03.test133문자열_돌리기;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] str = a.split("");
        
        for (String s : str) {
			System.out.println(s);
		}
        
    }

}
