package chap11.ex04Test;

public class User1 extends Thread{
	
	private Computer com;
	
	public User1(Computer com) {
		setName("User1");
		this.com = com;
	}

	@Override
	public void run() {
		com.setScore(500);
	}
	
	
	
}
