package executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public enum CaseSix {

	//Delaylı sekilde ve sürekli belirli aralıklarla calısmasını sağlayan yapı ScheduledExecutorService
//	bununla sağlanıyor.
//	
//	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
//	for (int i = 0; i < 100; i++) {
//		executorService.schedule(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Hello from " + Thread.currentThread().getName());					
//			}
//		}, 5, TimeUnit.SECONDS);
	
	//TODO asagıdaki örnek ise belirli aralıklarla sürekli thread calıstırma case.
//		
	
//	ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
//	for (int i = 0; i < 2; i++) {
//		executorService.scheduleAtFixedRate(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Hello from " + Thread.currentThread().getName());					
//			}
//		},3, 5, TimeUnit.SECONDS);
//		
//	}
	
//	private static final Logger logger = Logger.getLogger(ExecutorDemo.class.getName());
//
//	public static void main(String[] args) {
//		
//		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
//		for (int i = 0; i < 2; i++) {
//			executorService.scheduleAtFixedRate(new Runnable() {
//				
//				@Override
//				public void run() {
//					logger.info("Hello From" + Thread.currentThread().getName());					
//				}
//			},3, 5, TimeUnit.SECONDS);
//			
//		}
//	}
}
