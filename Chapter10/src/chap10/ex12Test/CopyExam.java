package chap10.ex12Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyExam {

	public static void main(String[] args) throws IOException {

		// 가져올, 내보낼 위치 지정
		Path from = Paths.get("C:/img/high.jpg");
		Path to = Paths.get("C:/img/temp/high_copy.jpg");
		
		// 읽어오기 + 쓰기
		Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		
		// 자원반납
		
	}

}
