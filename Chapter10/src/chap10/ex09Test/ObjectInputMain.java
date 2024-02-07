package chap10.ex09Test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Map;

public class ObjectInputMain {

	public static void main(String[] args) throws Exception {

		// 위치지정 + 주스트림 + 보조스트림
		FileInputStream fis = new FileInputStream("C:/img/temp/test2.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// 읽기
		Map<String, String> map = (Map<String, String>) ois.readObject();
		int[] arr = (int[]) ois.readObject();
		String str = ois.readUTF();
		Sample sample = (Sample) ois.readObject();
		
		System.out.println(map);
		System.out.println(Arrays.toString(arr));
		System.out.println(str);
		System.out.println(sample.method());
		
		// 자원반납
		ois.close();
		
	}

}
