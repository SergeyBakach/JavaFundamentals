package com.epam.tanya_adnokulova.java.lesson1.task3;
import java.util.Scanner;

/**
 * 
 * @author Tanya Adnokulova
 * task 3
 *
 */

public class Calculator {

	public static void main(String[] args) {
		Calculator run = new Calculator();
		run.calculator();
	}
	
	public int addition(int a, int b){
		return (a+b);
	}
	
	public int subsstraction(int a, int b){
		return (a-b);
	}
	
	public int multiplication(int a, int b){
		return (a*b);
	}
	
	public float division(int c, int d){
		float a = (float)c;
		float b = (float)d;
		return (a/b);
	}

	public void calculator(){
		boolean exit = true;
		Scanner in = new Scanner(System.in);
		
		do{
			System.out.println("Enter 2 numbers: ");
			int a = in.nextInt();
			int b = in.nextInt();
		    
			System.out.println("Choose an operation number:\n1) + \n2) - \n3) * \n4) / \n");
			int operation = in.nextInt();
		
			switch(operation){
				case 1:
					System.out.println("The result is: " + a + " + " + b + " = " + addition(a, b));
					break;
				case 2:
					System.out.println("The result is: " + a + " - " + b + " = " + subsstraction(a, b));
					break;
				case 3:
					System.out.println("The result is: " + a + " * " + b + " = " + multiplication(a, b));
					break;
				case 4:
					if (b == 0) 
						System.out.println("Division by zero is not allowed!");
					else
						System.out.println("The result is: " + a + " / " + b + " = " + division(a, b));
					break;
				default: 
					System.out.println("Unknown operation");
					break;
			}
			
			System.out.println("Enter 1 to continue, 0 to exit the application");
			a = in.nextInt();
			if (a == 0) exit = false;
			
		} while (exit);
		in.close();
	}
	
	
	
}
