package com.threads.threads;

public class PubSub extends Thread{
	
	volatile boolean notified = false;

	@Override
	public void run() {
		while(!notified) {
			
		}
		System.out.println("Message received");
	}
	
	public static void main(String[] args) throws InterruptedException{
		PubSub pubSub = new PubSub();
		pubSub.start();
		Thread.sleep(1000);
		System.out.println("Sleep is over");
		pubSub.notified = true;
		pubSub.join();
		System.out.println("Pubsub is terminated");
	}

}
