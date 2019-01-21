package com.practice.polymorphism;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author
 */
class ThreadLocalEx {

	public static void main(String args[]) throws IOException {
		Thread t1 = new Thread(new Task());
		Thread t2 = new Thread(new Task());
		Thread t3 = new Thread(new Task());

		t1.start();
		t2.start();
		t3.start();

	}

	/*
	 * Thread safe format method because every thread will use its own DateFormat
	 */
	public static String threadSafeFormat(Date date) {
		DateFormat formatter = PerThreadFormatter.getDateFormatter();
		return formatter.format(date);
	}

	public static String threadFormat(Date date) {
		DateFormat df = PerThreadFormatter.getDateFormat();
		return df.format(date);
	}

}

/*
 * Thread Safe implementation of SimpleDateFormat Each Thread will get its own
 * instance of SimpleDateFormat which will not be shared between other threads.
 * *
 */
class PerThreadFormatter {

	private static final ThreadLocal<SimpleDateFormat> dateFormatHolder = new ThreadLocal<SimpleDateFormat>() {

		/*
		 * initialValue() is called
		 */
		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println("Creating SimpleDateFormat for Thread : " + Thread.currentThread().getName());
			return new SimpleDateFormat("dd/MM/yyyy");
		}
	};

	private static final ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal<SimpleDateFormat>() {

		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println("Creating simpleDateFormat 2 " + Thread.currentThread().getName());
			return new SimpleDateFormat("dd-MM-yyyy");
		}
	};

	public static DateFormat getDateFormat() {
		return dateFormat.get();
	}

	/*
	 * Every time there is a call for DateFormat, ThreadLocal will return calling
	 * Thread's copy of SimpleDateFormat
	 */
	public static DateFormat getDateFormatter() {
		return dateFormatHolder.get();
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " Formatted Date: "
					+ ThreadLocalEx.threadSafeFormat(new Date()));
			System.out.println("Thread: " + Thread.currentThread().getName() + " Formatted Date: "
					+ ThreadLocalEx.threadFormat((new Date())));

		}
	}
}