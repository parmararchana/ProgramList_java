package practice;

import java.lang.reflect.Array;

public class Test {

	public static void main(String[] args) {
		int[] number = new int[100];
//		for(int i=1; i<=100 ;i++)
//		{
//			System.out.println(i);
//		}
		
		for(int i=1; i<=100 ;i++)
		{
			if(i%3==0)
			{
				
				
				if(i%5==0)
				{
					
					System.out.println("fizz-Buzz");
				}
				else
				{
					System.out.println("fizz");
				}
				
			}
			else if(i%5==0)
			{
				if(i%3==0)
				{
					
					System.out.println("fizz-Buzz");
				}
				else
					
					System.out.println("Buzz");
			}
			
//			if(i%3==0 && i%5==0)
//			{
//				System.out.println("fizz-Buzz");
//				
//			}
			else if(i%3!=0 && i%5!=0)
			{
				
				System.out.println(i);
			}
			
		}

	}

}
