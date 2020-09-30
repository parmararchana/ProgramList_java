package com.archana.CommomProgram;

import java.util.Scanner;

public class DivideWithMinus {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter the first no: ");
		int Num1=sn.nextInt();
		
		System.out.print("Enter the first no: ");
		int Num2=sn.nextInt();
		
	//	System.out.println(Num1/Num2);
		
		int sign=1,count=1;
		
		if(Num2==0)
		{
			System.out.println("Invalid input");
		}
		
		if(Num2>Num1)
		 {
			 
		if(Num1*Num2<0)
		{
			 sign=(-1);
			 if(Num1<0) {
				 Num1=(-Num1);
				 
			 }
			 else {
				 Num2=(-Num2);
			 }
			 
			 
			 
			 while(Num1-Num2 != 0)
				{
					int x= Num1-Num2;
					Num1=x;
					count++;
				}
			 System.out.println(sign*count);
		}
		
		
		
		 }
		
		else {
			
		
		while(Num1-Num2 != 0)
		{
			int x= Num1-Num2;
			Num1=x;
			count++;
		}
		
			System.out.println(count);
		
	}

	}

}
