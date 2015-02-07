package com.epam.tanya_adnokulova.java.lesson1.task2;
import java.util.Scanner;

/**
 * 
 * @author Tanya Adnokulova
 * task 2
 *
 */

public class StringProcessing {

	private final int n = 5;
	
	public static void main(String[] args) {
		StringProcessing run = new StringProcessing();
		run.stringManipulation();
	}

	public void stringManipulation() {
		String theLongestString = null;
		String theShortestString = null;
		Integer maxLength = null;
		Integer minLength = null;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		maxLength = str.length();
		theLongestString = str;
		minLength = str.length();
		theShortestString = str;
		
		for (int i = 1; i < n; i++) {
			System.out.println("Enter a string: ");
			str = in.nextLine();
			
			if (str.length() > maxLength) { //searching for the longest string
				maxLength = str.length();
				theLongestString = str;
			}
			if (str.length() < minLength) {
				minLength = str.length();
				theShortestString = str;
			}
		}	

		System.out.println("The longest string is: " + theLongestString + "\nIts length is: " + theLongestString.length() + "\nThe shortest string is: " + theShortestString + "\nIts length is: " + theShortestString.length());
		in.close();
	}
}
