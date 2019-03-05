package com.practice.producerconsumer;
//
//import java.text.SimpleDateFormat;
//import java.util.Random;
//
//public class ThreadLocalClass {
//	private static final ThreadLocal<SimpleDateFormat> THREAD_LOCAL = new ThreadLocal<SimpleDateFormat>() {
//		@Override
//		protected SimpleDateFormat initialValue() {
//			return new SimpleDateFormat("dd/mm/yyyy");
//		}
//	};
//
//	private static final ThreadLocal<SimpleDateFormat> THREAD_LOCAL2 = ThreadLocal.withInitial(() -> {
//		return new SimpleDateFormat("yyyy-mm-dd");
//	});
//
//	public static void main(String[] args) throws InterruptedException {
//		ThreadLocalClass threadLocalClass = new ThreadLocalClass();
//		for (int i = 0; i < 5; i++) {
//			Thread thread = new Thread() {
//				final int j=0;
//				@Override
//				public void run() {
//					System.out.println("Current thread running is " +" "+ j+Thread.currentThread().getName()
//							+ " and default format is " + THREAD_LOCAL.get().toPattern());
//					THREAD_LOCAL.set(new SimpleDateFormat("dd-mm-yyyy hh:mm:ss"));
//					System.out.println("Current thread running is " + Thread.currentThread().getName()
//							+ " and format is " + THREAD_LOCAL.get().toPattern());
//					System.out.println("Second thread local running is " + Thread.currentThread().getName()
//							+ " and default format is " + THREAD_LOCAL2.get().toPattern());
//					THREAD_LOCAL2.set(new SimpleDateFormat("yyyy-dd-mm ss:mm:hh"));
//
//					System.out.println("Second thread local running is " + Thread.currentThread().getName()
//							+ " and  format is " + THREAD_LOCAL2.get().toPattern());
//					;
//
//				}
//				
//				
//			};
//			Thread.sleep(new Random().nextInt(5000));
//			thread.start();
//			
//			
//		}
//
//	}
//
////	@Override
////	public void run() {
////		System.out.println("Current thread running is " + Thread.currentThread().getName() + " and default format is "
////				+ THREAD_LOCAL.get().toPattern());
////		THREAD_LOCAL.set(new SimpleDateFormat("dd-mm-yyyy hh:mm:ss"));
////		System.out.println("Current thread running is " + Thread.currentThread().getName() + " and format is "
////				+ THREAD_LOCAL.get().toPattern());
////		System.out.println("Second thread local running is " + Thread.currentThread().getName()
////				+ " and default format is " + THREAD_LOCAL2.get().toPattern());
////		THREAD_LOCAL2.set(new SimpleDateFormat("yyyy-dd-mm ss:mm:hh"));
////
////		System.out.println("Second thread local running is " + Thread.currentThread().getName() + " and  format is "
////				+ THREAD_LOCAL2.get().toPattern());
////		;
////
////	}
//
//}
public class ThreadLocalClass 
{ 
	private int data = 10; 
	
	class Inner 
	{ 
		private final int rt = 20; 
		
		private int getData() 
		{
			return rt; 
		} 
		public void main(String[] args) 
		{ 
			Inner inner = new Inner(); 
			 data=90;
			System.out.println(inner.getData()); 
			
		} 
	} 
	private int getData() 
	{ 
		return data; 
	} 
	public static void main(String[] args) 
	{ 
		ThreadLocalClass outer = new ThreadLocalClass(); 
		ThreadLocalClass.Inner inner = outer.new Inner();
		inner.main(args);
		System.out.printf("%d\n", outer.getData()); 
		 
	} 
} 
