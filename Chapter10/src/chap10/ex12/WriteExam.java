package chap10.ex12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteExam {

	public static void main(String[] args) throws Exception {

		// JAVA IO 방식으로 입력받은 내용 파일로 저장하기
		// scanner 생성
		// scanner 입력
		// 위치지정 + 주스트림
		// 저장(내보내기)
		// 자원 반납

		// JAVA NIO 방식으로 입력받은 내용 파일로 저장하기
		// scanner 생성
		Scanner scan = new Scanner(System.in);
		
		// scanner 입력
		System.out.println("입력 >");
		String msg = scan.nextLine() + "\r\n";

		// 저장(내보내기)
		Path path = Paths.get("C:/img/nio/input.txt");
		if(Files.notExists(path)) {
			Files.createFile(path);
		}
		Files.write(path, msg.getBytes("UTF-8"), StandardOpenOption.APPEND);
		/* APPEND : 같은 파일이 있을 경우 이후에 내용을 추가
		 * CREATE : 파일이 존재하지 않으면 파일 생성
		 * CREATE_NEW : 이미 파일이 존재할 경우 새 파일을 생성
		 * READ : 읽기 전용
		 */

		// 자원 반납
		scan.close();
		System.out.println("저장완료");

	}

}











