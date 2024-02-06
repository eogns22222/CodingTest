package chap10.ex12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadExam {

	public static void main(String[] args) throws IOException {

		// java IO
		// 위치지정 + 주스트림
		// 보조스트림
		// 읽기
		// 자원반납

		// java NIO
		// 위치지정
		Path path = Paths.get("C:/img/temp/test.txt");

		// 읽기 - 일반 바이너리 파일의 경우 readBytes(path)
		List<String> lines = Files.readAllLines(path);
		for (String str : lines) {
			System.out.println(str);
		}


	}

}











