package com.practice.java;

public class SumProblem {
	
	public static void main(String []args)
	{
		int count=0;
		int nxtCount=0;
		for (int i=1;i<=1000;i++)
		{
			//99999999999System.out.println("i"+i);
			if((i%3==0)&&(i%5==0)) {
				//System.out.println("iii "+i);
				count =count+i;
				nxtCount++;
				
			}
			if(nxtCount==5)
			{
				System.out.println("Total Count "+count);
			break;
			}
		}
		do {
			
		}while(count==7);
	}
	
}
