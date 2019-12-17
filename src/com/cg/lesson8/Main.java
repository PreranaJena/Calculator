package com.cg.lesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter your mobile number: ");
		String mobno= sc.nextLine();
		
		System.out.println("Enter your email address: ");
		String emailID= sc.nextLine();
		
		
		//for name validation
		String regexname="^[A-Z][a-z]{5,10}$";
		Pattern patternname= Pattern.compile(regexname);
		Matcher matchingname=patternname.matcher(name);
		if(matchingname.find()==true)
			System.out.println("The name is: " + name);
		else
			System.out.println("Error. Please enter your name again");
		
		
		
		//for mobile number validation
		String regexnumber="^[6-9]\\d{9}$";
		Pattern patternnum= Pattern.compile(regexnumber);
		Matcher matchingnum=patternnum.matcher(mobno);
		if(matchingnum.find()==true)
			System.out.println("The mobile number is: " + mobno);
		else
			System.out.println("Error. Please enter your mobile number again");
		
		//for email id
		String regexemail="^(.+)@(.+)$";
		Pattern patternemail= Pattern.compile(regexemail);
		Matcher matchingemail=patternemail.matcher(emailID);
		if(matchingemail.find()==true)
			System.out.println("The email is: " + emailID);
		else
			System.out.println("Error. Please enter your email id again");	
		
		
		}
		
		

	}


