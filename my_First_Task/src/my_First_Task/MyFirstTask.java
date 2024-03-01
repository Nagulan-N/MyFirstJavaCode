package my_First_Task;
import java.util.Scanner;  // Import the Scanner class

public class MyFirstTask {
	public static void main (String [] args) {
		Scanner myObj = new Scanner(System.in);
		
		//1) Write a program to print the numbers from 10 to 50 using for loop/while loop.
		
		for(int i = 10; i <= 50; i++) {
		    System.out.println(i);
		}
		System.out.println("***************************************");
		//2) Write a program that find a given number is negative or positive .
		System.out.println("Enter a Number");

		 try {
			 
				int number = myObj.nextInt();
			 if(number < 0) {
				    System.out.println("The number is negative");
				} else if(number > 0) {
				    System.out.println("The number is positive");
				} else {
				    System.out.println("The number is zero");
				}	 
			 } catch (Exception e) {
	            System.out.println("Enter Value should be Number.");
	        }

				
		
			System.out.println("***************************************");
	   // 3) Write down the program  to reverse the given number using loops . Input = 876 output=678

		 int number = 876;
		 int reversed = 0;
		 while(number != 0) {
		     int digit = number % 10;
		     reversed = reversed * 10 + digit;
		     number /= 10;
		 }
		 System.out.println("Reversed Number: " + reversed);
		 System.out.println("***************************************");
		 // 4) Write  a java program to Find the smallest number among three numbers .
		 
		 try{
			 System.out.println("Enter A Value");
	         int a = myObj.nextInt();// first number here
	         System.out.println("Enter B Value");
			 int b = myObj.nextInt();// second number here
			 System.out.println("Enter C Value");
			 int c = myObj.nextInt();// third number here
			 int smallest = Math.min(Math.min(a, b), c);
			 System.out.println("The smallest number is " + smallest);
		 }catch(Exception e) {
			 System.out.println("Enter Value should be Number.");
		 }
		System.out.println("***************************************");
		 //5)
		System.out.println("Enter Purchase Amount");
		 double purchaseAmount = myObj.nextDouble();// your purchase amount here
				 double finalAmount;
				 if(purchaseAmount < 500) {
				     finalAmount = purchaseAmount;
				 } else if(purchaseAmount <= 1000) {
				     finalAmount = purchaseAmount * 0.9;
				 } else {
				     finalAmount = purchaseAmount * 0.8;
				 }
				 System.out.println("The final payable amount is " + finalAmount);
		 System.out.println("***************************************");	 
		//6)
		  
				 for(int i = 5; i >= 1; i--) {
					    for(int j = 5; j > 0 ; j--) {
					    	System.out.print(Math.max(i, j) + " ");
					    }
					    System.out.println();
					}
		  System.out.println("***************************************");

	}

}
