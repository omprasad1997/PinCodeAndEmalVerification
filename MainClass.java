package com.blbz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainClass {
	
	public static void completeEmailValidation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter email : ");
		String userEmail = sc.nextLine();
		if(Pattern.matches("^[a-z0-9]{3}[.][_a-z0-9]*@[a-z]*[.][a-z]{2}$", userEmail))
			System.out.println("Valid email");
		else    
			System.out.println("Invalid email");
	}
	public static void main(String[] args) {
	
		completeEmailValidation();
	}
}
