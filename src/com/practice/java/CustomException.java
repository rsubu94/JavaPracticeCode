package com.practice.java;

class CustException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String errorMessageString;
	public CustException() {}

	public CustException(String errorMessageString) {
		super();
		//System.out.println("cust");
		this.errorMessageString = errorMessageString;
		//System.out.println(errorMessageString);
	}

	public String getErrorMessageString() {
		return errorMessageString;
	}
	

//	@Override
//	public String toString() {
//		return "Customized Exception";
//	}

}

//class CustomException extends Thread {
//	public static void main(String[] args) {
//		try {
//
//			Thread thread = new Thread(new Runnable() {
//
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//
//				}
//			});
//
//			thread.run();
//			// throw new CustException("New customized exception");
//			throw new CustException();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//}
