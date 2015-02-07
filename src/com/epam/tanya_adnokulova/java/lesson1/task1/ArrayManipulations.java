package com.epam.tanya_adnokulova.java.lesson1.task1;

/**
 * 
 * @author Tanya Adnokulova
 * task 1
 *
 */

public class ArrayManipulations {
	
	private final int size = 20;
	private int[] array = new int[size];

	public static void main(String[] args) {
		ArrayManipulations run = new ArrayManipulations();
		run.arrayManipulations();
	}
	
	public void print(){
		for (int i : array) {
			System.out.printf(" " + i); 
		}
	}
	
	public void arrayManipulations() {
		for (int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() * (size+1)) - (size/2); // [-10;10] 
		}
		
		System.out.print("Original array:");
		print();
		
		int maxPositiveValue = size/2; 
		int minNegativeValue = -size/2;
		int minPositiveIndex = 0;
		int maxNegativeIndex = 0;
		
		for (int i = 0; i < array.length; i++){
			if (array[i] > 0 && array[i] < maxPositiveValue){
				maxPositiveValue = array[i];
				minPositiveIndex = i;
			}
			if (array[i] < 0 && array[i] > minNegativeValue){
				minNegativeValue = array[i];
				maxNegativeIndex = i;
			}
		}
		
		int tmp = array[minPositiveIndex]; 
		array[minPositiveIndex] = array[maxNegativeIndex];
		array[maxNegativeIndex] = tmp;
		
		System.out.print("\nModified array:");
		print();
	}
}
