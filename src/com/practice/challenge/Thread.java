package com.practice.challenge;

 class Thread {

}

class One implements Runnable{

	@Override
	public void run() {
		System.out.println("Current Thread "+Thread.class.getName());
	}
	
}

class Two implements Runnable{

	@Override
	public void run() {
		new One().run();
		//new Thread(new One(),"gf2").run();
	}
	
}