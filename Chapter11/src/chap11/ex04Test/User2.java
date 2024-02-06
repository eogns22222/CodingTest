package chap11.ex04Test;

public class User2 extends Thread{

private Computer com;
	
	public User2(Computer com) {
		setName("User2");
		this.com = com;
	}

	@Override
	public void run() {
		com.setScore(200);
	}
	
}
