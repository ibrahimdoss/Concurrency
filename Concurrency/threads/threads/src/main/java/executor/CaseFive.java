package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public enum CaseFive {
	
	//Burada tekrar kullanılmıs threadler oldugu icin bunu sağlayan yapı da "newCachedThreadPool"
//	o yüzden 100'e kadar thread acmaz da en son kac tane tekrarlı thread kullanıyorsa o kadar acıyor.
	
//	
//	ExecutorService executorService = Executors.newCachedThreadPool();
//	for (int i = 0; i < 100; i++) {
//		executorService.submit(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Hello from " + Thread.currentThread().getName());					
//			}
//		});
//		
//	}

}
