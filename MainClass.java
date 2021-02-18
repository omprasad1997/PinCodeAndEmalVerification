package com.blbz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter email : ");
		String userEmail = sc.nextLine();
		Pattern pt = Pattern.compile("^(.+)+@bridgelabz[.]co$");
		Matcher mt = pt.matcher(userEmail);

		boolean result = mt.matches();

		if(result)
			System.out.println("Valid email");
		else    
			System.out.println("Invalid email");

	}
}
