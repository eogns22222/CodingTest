package chap11.ex12;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		
		// 쓰레드 풀을 생성한다.
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService ex = Executors.newFixedThreadPool(n);
		
		// 빌려달라는 양식 작성
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				// 개의 스레드가 10번 출력
//				for (int i = 1; i < 10; i++) {
//					
//					System.out.println("Thread Pool : " + Thread.currentThread().getName());
//				}
				
				// 10개의 스레드가 1번씩 출력
				System.out.println("Thread Pool : " + Thread.currentThread().getName());
			}
		};
		
		// 빌려달라고 요청
		for (int i = 1; i <= 10; i++) {
			ex.execute(run);
			
		}
		
		// 쓰레드 풀 종료
		ex.shutdown();
		boolean end = ex.awaitTermination(1, TimeUnit.SECONDS);
		System.out.println(end);
		
	}

}
