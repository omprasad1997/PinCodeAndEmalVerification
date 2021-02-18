package com.blbz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Pin Code : ");
		String pinCode = sc.nextLine();
		Pattern pt = Pattern.compile("^[0-9][0-9]{5}$");
		Matcher mt = pt.matcher(pinCode);

		boolean result = mt.matches();

		if(result)
			System.out.println("Valid Pin");
		else    
			System.out.println("Invalid Pin");

	}

}
