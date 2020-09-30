package com.archana.CommomProgram;

/**
 * Hello world!
 *
 */
public class FibboSeries 
{
    public static void main( String[] args )
    {
    	fibbonacci objFibbonacci=new fibbonacci();
    	objFibbonacci.fibbo(10);
    	
    }
}


class fibbonacci {
	public void fibbo(int n) {

		int n1 = 0, n2 = 1, sum;

		if (n == 0) {

			System.out.println("0");
		}

		else {
			System.out.print(n1 + " ");
			System.out.print(n2 + " ");
			for (int i = 3; i <= n; i++) {
				sum = n1 + n2;
				System.out.print(sum + " ");
				n1 = n2;
				n2 = sum;

			}

		}

	}
}