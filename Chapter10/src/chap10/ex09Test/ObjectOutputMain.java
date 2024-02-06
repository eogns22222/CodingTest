package chap10.ex09Test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectOutputMain {

	public static void main(String[] args) throws Exception {

		// 위치지정 + 주스트림 + 보조스트림
		FileOutputStream fos = new FileOutputStream("C:/img/temp/test2.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		// 내보내기(쓰기)
		Map<String, String> map = new HashMap<String, String>();
		map.put("쌀", "밥");
		map.put("밀", "빵");
		
		int[] arr = {10, 20, 30};
		oos.writeObject(map);
		oos.writeObject(arr);
		oos.writeUTF("밥밥밥");
		oos.writeObject(new Sample());
		
		// 자원반납
		oos.close();
		
	}

}
