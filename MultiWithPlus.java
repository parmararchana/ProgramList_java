package com.archana.CommomProgram;

public class MultiWithPlus {

	public static void main(String[] args) {

		Multiplication obj = new Multiplication();

		obj.Multi(0, 0);
		obj.Multi(0, -1);
		obj.Multi(0, 4);
		obj.Multi(9, 0);
		obj.Multi(-7, 0);
		obj.Multi(5, 5);
		obj.Multi(-6, 2);
		obj.Multi(-2, -2);
		obj.Multi(8, -3);

	}

}

class Multiplication {

	void Multi(int n1, int n2) {
		int ans = 0, temp = n2;

		if (n2 < 0) {
			temp = (-n2);
		}

		for (int i = 0; i < temp; i++) {
			ans = ans + n1;

		}
		if (n1 < 0 && n2 < 0 || n1 >= 0 && n2 < 0)

			System.out.println(-ans);
		else

			System.out.println(ans);

	}

}