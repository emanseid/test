

import java.util.Scanner;

public class Question20 {
public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		float balance;
		float interestrate;
		float interest;
		
		System.out.println("Enter balance and interest rate");
		
		balance = input.nextFloat();
		
		interestrate = input.nextFloat();
		
		interest = balance * (interestrate/1200);
		
		System.out.println("The interest is  "+interest);
		
		
		
	}

}



