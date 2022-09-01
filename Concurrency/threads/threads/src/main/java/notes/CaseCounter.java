package notes;

import java.util.concurrent.atomic.AtomicInteger;

import com.threads.threads.Counter;

public enum CaseCounter {

	//Verinin bozulmasıyla alakalı örnek.
//	Burada thread1 arttırırken thread2 de arttırıyor ve dolayısıyla ikisi de farklı değerler üretiyor
//	Çünkü thread1 arttırırken veriyi heapte güncellemiyor dolayısıyla thread2 de eski veriyle 
//	arttırma islemine girmis oluyor ve veri bozulmus oluyor.
	
	//Bunun icin de transactional kullanırız aynı anda erisemesin diye kullanılabilir.
	
	//TODO Solution 
//	Buradaki ilk cözüm counter icinde asagıdaki koda "synchronized" eklemek olacaktır.
//	public synchronized void increment() {
//		this.count++;
//	}
	
	//synchronized olmazsa ise su sekilde asagıdaki gibi AtomicInteger kullanabiliriz.
	
//private AtomicInteger count = new AtomicInteger();
//	
//	public void increment() {
//		this.count.incrementAndGet();
//	}
//	
//	public int getCount() {
//		return this.count.get();
//	}
	
//	
//	Counter counter = new Counter();
//	
//	Thread t1 = new Thread(() ->{
//		for (int i = 0; i < 100_000; i++) {
//			counter.increment();
//		}
//		System.out.println("Count is " + counter.getCount() + 
//				", Thread is"+ Thread.currentThread().getName());
//	});
//	
//	Thread t2 = new Thread(() ->{
//		for (int i = 0; i < 100_000; i++) {
//			counter.increment();
//		}
//		System.out.println("Count is " + counter.getCount() + 
//				", Thread is"+ Thread.currentThread().getName());
//	});
//	
//	t1.start();
//	t2.start();
//}
//result 
//Count is 101371, Thread isThread-1
//Count is 145866, Thread isThread-0

}
