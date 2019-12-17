package com.cg.calculator;
import java.util.Scanner;

	public class Calculator {
		
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
			double num1 = sc.nextDouble();
			System.out.println("Enter Second number:");
			double num2 = sc.nextDouble();		
		int menuSelection;
	        do{
	            int invalid = 0;
	 	System.out.println("\nChoose One: \n");
	            System.out.println("\n 1. Add\n");
	            System.out.println(" 2. Subtract\n");
	            System.out.println(" 3. Divide\n");
	            System.out.println(" 4. Exit\n");
	            menuSelection = sc.nextInt();
	 
	            while (menuSelection < 1 || menuSelection > 4) {
	                invalid++;
	                if(invalid >= 3) {
	                    System.out.println("Many invalid attempts. Session Timed out");
	                    System.exit(0);
	                }   
	                System.out.print(" Invalid input, try again \n"); 
	                menuSelection = sc.nextInt();
	 
	            }	
		
		double result=0;
	        switch(menuSelection)
	        	{
	            case 1:
	            	result = num1 + num2;
			System.out.println("The output is : "+result);
	                return;

	            case 2:
	            	result = num1 - num2;
			System.out.println("The output is : "+result);                
			return;

	            case 3:
	            	while(num2 == 0 ){
	                    System.out.print("Sorry, you can't divide by zero \n");
	                    System.out.print("what is the second number : ");
	                    num2 = sc.nextInt();
	                }
			result = num1 / num2;
			System.out.println("The output is : "+result);
	                return;
	            case 4:
	            	System.out.println("Exiting");
	            	return;
			
	            }
		
		}
		while (menuSelection != 4);
		sc.close();
		}
	}


