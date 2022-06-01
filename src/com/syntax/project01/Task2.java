package com.syntax.project01;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------Task2----------");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the numbers of elements in array");
			int num=in.nextInt();
			String [] countries=new String[num];
				
				System.out.println("Enter the name of the countries");
				String capital="null";
				in.nextLine();
				for(int i=0; i<num;i++) {
					countries[i]=in.nextLine();
					if(countries[i].equals("Ukraine")) {
						capital="Kyiv";
					}else if (countries[i].equals("USA")) {
						capital="Washington";
					}else if (countries[i].equals("Poland")) {
						capital="Warszawa";
					}else {
						capital="Unknown";
					}
				
					System.out.println("The capital of " +countries[i]+" is "+capital);
				
		}
	}

}
