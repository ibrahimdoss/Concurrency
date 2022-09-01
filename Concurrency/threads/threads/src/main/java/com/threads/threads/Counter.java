package com.threads.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private AtomicInteger count = new AtomicInteger();
	
	public void increment() {
		this.count.incrementAndGet();
	}
	
	public int getCount() {
		return this.count.get();
	}
}
