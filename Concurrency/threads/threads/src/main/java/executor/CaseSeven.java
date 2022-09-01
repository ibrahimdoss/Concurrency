package executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public enum CaseSeven {
	
	//Callable case'i burada future ile return değeri alabiliyoruz. Runnable void oldugu icin alamıyorduk.
	//bURADA bize bir future dönüyor.
//	
//	Callable<String> callable = new Callable<String>() {
//
//		@Override
//		public String call() throws Exception {
//			return "Hello from " + Thread.currentThread().getName();
//		}
//		
//	};
//	ExecutorService executorService = Executors.newFixedThreadPool(5);
//	java.util.concurrent.Future<String> future = executorService.submit(callable);
//	System.out.println(future.get());
//	}
//
//	OUTPUT: 
//		Hello from pool-1-thread-1


}
