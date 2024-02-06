package chap10.ex11Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExam {

	public static void main(String[] args) throws Exception {

		// 폴더 생성
		Path path = Paths.get("C:/img/nio");
		if(Files.notExists(path)) {
			Files.createDirectories(path);
		}
		
		// 파일 생성
		Path path2 = Paths.get("C:/img/nio/test.txt");
		Files.createFile(path2);
		
	}

}
