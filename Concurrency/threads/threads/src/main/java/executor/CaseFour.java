package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public enum CaseFour {
	
	//Buradaki case ise core sayısına göre pool sayısını verebiliyorduk.
	//11.satırdaki kod ile bizim sistemimizde kac tane core varsa o kadar core kullanarak calısıyor.
	
//	int cores = Runtime.getRuntime().availableProcessors();
//	ExecutorService executorService = Executors.newFixedThreadPool(cores);
//	for (int i = 0; i < 10; i++) {
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
