package com.calderon.oldorevent;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int newNum = scan.nextInt();
		
		if(newNum > 0) {
			System.out.println("the number is positive");
		}else if(newNum < 0) {
			System.out.println("the number is ");
		} else {
			System.out.println("the number is zero");
		}
		

	}

}
