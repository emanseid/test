package edu.cis.chapter02.example;
import java.util.Scanner;
public class Chapter02Question1 {
	
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		double Fahrenheit;
		double Celsius;
		System.out.println("Please enter the celsius:");
		Celsius = input.nextDouble();
		Fahrenheit = (9.0/5)*Celsius + 32;
		
		System.out.println(Celsius+"   "+" "+"celsius is"+" "+Fahrenheit+"  "+"Fahrenheit");
		
	}

}
