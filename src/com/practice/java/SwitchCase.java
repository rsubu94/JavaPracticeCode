package com.practice.java;

public class SwitchCase {

	public static void main(String[] args) {
	
		int switchValue=5;
		switch (switchValue) {
		case 1:
			System.out.println("Case 1 successed");
			break;
		case 10:
			System.out.println("Case 2 Successed");
		case 3:case 4:case 5:
			System.out.println("Case either 3 or 4 or 5");
			break;
		default:
			break;
		}
		
		char switchValueChar= 'e';
		switch (switchValueChar) {
		case 'b':
			System.out.println("Case b");
			break;
		case 'A':case 'a':
			System.out.println("Case A or a");
			break;
		default:
			System.out.println("Either Case");
			break;
		}

	}

}
