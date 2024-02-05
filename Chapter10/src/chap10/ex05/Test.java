package chap10.ex05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		
		// 1. Scanner 로 입력 받기 
		Scanner scan = new Scanner(System.in);
		System.out.println("저장할 내용을 입력해주세요.");
		String input = scan.nextLine();
		
		
		// 2. 파일 위치 지정 + 객체 생성
		File file = new File("C:/img/temp/semple.txt");
		if(file.exists() == false) {
			file.createNewFile();
		}
		
		
		// 3. 빨대 준비
		FileWriter writer = new FileWriter(file, true);
		// 4. 내보내기
		writer.write(input + "\r\n");
		// 5. 반납
		scan.close();
		writer.flush();
		writer.close();
		
		
	}

}
