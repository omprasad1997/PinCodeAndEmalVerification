package com.blbz;

import java.util.Scanner;

public class MainClass {
	
	public static final int maxDigit = 6;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Pin Code : ");
		int userPinCode = sc.nextInt();
		int counter = 0;
		
		while(userPinCode > 0)
		{
			userPinCode = userPinCode / 10;
			counter++;
		}
		
		if(counter == maxDigit)
			System.out.println("Valid Pin");
		else
			System.out.println("Invalid Pin");

	}

}
