package chap10.ex08;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) throws Exception {

		// 이름과 급여와 승진여부를 입력받아
		// input_sample02.dat 파일에 저장하시오.
		
		// scanner 생성
		Scanner scan = new Scanner(System.in);
		
		// scanner 입력
		System.out.println("이름 : ");
		String inputStr = scan.nextLine();
		
		System.out.println("이름 : ");
		int inputInt = scan.nextInt();
		
		System.out.println("이름 : ");
		boolean inputBool = scan.nextBoolean();
		
		// 위치지정 + 객체생성 + 주스트림
		FileOutputStream fos = new FileOutputStream("C:/img/temp/input_sample02.dat");
		
		// 자바 고유 데이터 사용 보조 스트림 생성
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 내보내기
		dos.writeUTF(inputStr);
		dos.writeInt(inputInt);
		dos.writeBoolean(inputBool);
		
		// 자원 반납
		scan.close();
		dos.flush();
		dos.close();
		
		
	}

}
