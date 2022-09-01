package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public enum CaseThree {
//	
//	ThreadPool örneği newFixedThreadPool ile alakalı.
//	Bu process'in bitmeme sebebi ise terminate etmek gerekiyor. 
//	Bunu da executorService1.shutdown();
//	diyerek kapatmıs oluruz.
//	
//
//	ExecutorService executorService1 = Executors.newFixedThreadPool(10);
//	for (int i = 0; i < 10; i++) {
//		executorService1.submit(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Hello from " + Thread.currentThread().getName());					
//			}
//		});
//		
//	}
//	
//	
//	Output :
//		
//		Hello from pool-1-thread-1
//		Hello from pool-1-thread-10
//		Hello from pool-1-thread-9
//		Hello from pool-1-thread-7
//		Hello from pool-1-thread-6
//		Hello from pool-1-thread-8
//		Hello from pool-1-thread-3
//		Hello from pool-1-thread-5
//		Hello from pool-1-thread-4
//		Hello from pool-1-thread-2
//

}
