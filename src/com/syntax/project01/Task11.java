package com.syntax.project01;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers=  {2, 4, 3, 6, 2, 7, 7, 8, 3};   
         System.out.println("Duplicate elements in given array: ");  
         for(int i = 0; i < numbers.length; i++) {  
            for(int j = i + 1; j < numbers.length; j++) {  
                if(numbers[i] == numbers[j])  
                    System.out.println(numbers[j]);  
            }  
        }  
		 }    
		
		
		
		
	}


