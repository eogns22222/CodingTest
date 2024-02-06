package chap10.ex12Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadExam {

	public static void main(String[] args) throws IOException {

		// 위치지정
		Path path = Paths.get("C:/img/temp/test2.txt");
		// 읽기
		List<String> list = Files.readAllLines(path);
		for (String str : list) {
			System.out.println(str);
		}
		
		// 자원반납
		
	}

}
