package notes;

//import com.threads.threads.ThreadsApplication.OrderProcessor;

public enum CaseThree {

//	private static class OrderProcessor extends Thread{
//		@Override
//		public void run() {
//			printFive();
//		}
//		
//		
//	}
//	public static void main(String[] args) {
//		//printFive();
//		
//		Thread t1 = new OrderProcessor();
//		Thread t2 = new OrderProcessor();
//		t1.start();
//		t2.start();
//	}
//	
//	private static void printFive() {
//		for(int i = 0; i<5; i++ ) {
//			System.out.println("Count" + i + ", Thread: " + Thread.currentThread().getName());
//		}
//	}
//	
//	Yukarıdaki casede ise threadi cokladık, bu durumda Count0, Thread: Thread-1
//	Count1, Thread: Thread-1
//	Count2, Thread: Thread-1
//	Count0, Thread: Thread-0
//	Count1, Thread: Thread-0 gibi cıktı alındı cünkü burada CPU'ya sırayla islem yaptırmaya calısıyorlar
//	CPU'ya bazı isleri yaptırmayı deniyorlar o yüzden bu sekilde bazen 1 bazen 0 olan thread calısıyor.
}
