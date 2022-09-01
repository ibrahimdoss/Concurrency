package com.threads.threads;

public class CounterTest {
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Thread t1 = new Thread(() ->{
			for (int i = 0; i < 100_000; i++) {
				counter.increment();
			}
			System.out.println("Count is " + counter.getCount() + 
					", Thread is"+ Thread.currentThread().getName());
		});
		
		Thread t2 = new Thread(() ->{
			for (int i = 0; i < 100_000; i++) {
				counter.increment();
			}
			System.out.println("Count is " + counter.getCount() + 
					", Thread is"+ Thread.currentThread().getName());
		});
		
		t1.start();
		t2.start();
	}

}
