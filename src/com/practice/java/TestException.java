package com.practice.java;

class TestException extends Exception {
	private String msgString = "";

	public TestException(String msg) {
		this.msgString = msg;
	}

	public String getMsgString() {
		return msgString;
	}
	

}

class MainEx {
	public static void main(String[] args) {
		try {
			throw new TestException("TestException");
		} catch (TestException e) {
			System.out.println(e.getMsgString());
			e.printStackTrace();
		}
	}
}
