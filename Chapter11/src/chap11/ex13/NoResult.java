package chap11.ex13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResult {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		ExecutorService pool = Executors.newCachedThreadPool(); // 풀 생성
		
		Runnable run = new Runnable() { // 할 일 지정
			
			@Override
			public void run() {
				try {
					for (int i = 1; i <= 5; i++) {
						System.out.println("작업 처리 중...");
						Thread.sleep(500);
					}
					
				} catch (InterruptedException e) {
					System.out.println("강제 종료 당함!");
				}
				
			}
		};
		
		// runnable 은 반환하는 것이 없지만 blocking 기능을 이용하기 위해 예외적으로 submit() 을 사용할 수 있도록 해주었다.
//		pool.execute(run); // 요청
		Future<?> fu = pool.submit(run); // 반환타입이 void 이므로 반환타입을 와일드카드로 대체했다.
		fu.get(); // 실제로 반환받는건 없지만 블로킹을 위해 사용 함
		System.out.println("작업 완료");
		
		pool.shutdownNow(); // 풀 종료
		
		
	}

}
