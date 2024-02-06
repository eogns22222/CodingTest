package chap10.ex12Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteExam {

	public static void main(String[] args) throws Exception {

		// Scanner 생성
		Scanner scan = new Scanner(System.in);
		// Scanner 입력
		System.out.println("입력>");
		String str = scan.nextLine();
		
		// 위치지정
		Path path = Paths.get("C:/img/temp/test2.txt");
		if(Files.notExists(path)) {
			Files.createFile(path);
		}
		
		// 쓰기
		Files.write(path, str.getBytes("UTF-8"), StandardOpenOption.APPEND);
		
		scan.close();
		
	}

}
