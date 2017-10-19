package com.testpackage;

public class Main {

	public static void main(String[] args) {
		int number = 22;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
			{
				System.out.println(" " + i);
			}
		}
	}
}
