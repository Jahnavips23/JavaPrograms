package javanumberprograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);   // Creating a scanner object called sc,  Helps to read input from the keyboard
		
		System.out.println("Enter a number");
		int num = sc.nextInt();                 // User types a number, num = 1234
		
		int reverse=0;                          // Variable to store the reversed number
		
		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num/10;
		}
		
		System.out.println("Reversed number: " +reverse);

	}

}







		