/* Factorial of a number means multiplying all numbers from 1 up to that number.
  n! = n × (n-1) × (n-2) × ... × 1
  Examples:

	5! = 5 × 4 × 3 × 2 × 1 = 120
	
	4! = 4 × 3 × 2 × 1 = 24
	
	3! = 3 × 2 × 1 = 6
	
	1! = 1
*/


package javanumberprograms;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

        int fact = 1;    //Because factorial is multiplication. If we use 0, everything becomes 0.
        
        for(int i = 1;i<=num;i++) {
        	fact = fact*i;
        }
        
        System.out.println("Factorial = " + fact);
        	
        }

	}


// using while loop

/*
  package javanumberprograms; 
  
  import java.util.Scanner;
  
  public class FactorialExample {
  	
  	public static void main(String[] args) {
  	
  		Scanner sc = new Scanner(System.in);
  		System.out.println("Enter a number");
  		int num = sc.nextInt();
  		
  		int fact = 1;
  		int i=1;
  		int num = 5;
  		
  	
  
 */