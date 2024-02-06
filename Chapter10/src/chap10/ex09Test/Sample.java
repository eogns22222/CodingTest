package chap10.ex09Test;

import java.io.Serializable;

public class Sample implements Serializable {

	String name = "강대훈";
	int age = 31;
	
	public String method() {
		return "학원 다니는 중";
	}

}
