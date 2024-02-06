package chap11.ex04Test;

public class PcRoom {

	public static void main(String[] args) {

		Computer com = new Computer();
		
		User1 user1 = new User1(com);
		User2 user2 = new User2(com);
		
		user1.start();
		user2.start();
	}

}
