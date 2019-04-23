package com.practice.java;

class CustException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String errorMessageString;

//	public CustException(String errorMessageString) {
//		super();
//		this.errorMessageString = errorMessageString;
//	}

	@Override
	public String toString() {
		return "Customized Exception";
	}

}

class CustomException extends Thread {
	public static void main(String[] args) {
		try {

			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

				}
			});

			thread.run();
			// throw new CustException("New customized exception");
			throw new CustException();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
