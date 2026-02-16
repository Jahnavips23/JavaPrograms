package javanumberprograms;

import java.util.Scanner;

public class FibonacciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers");
		int n = sc.nextInt();
		
		int a = 0,b=1;
		
		System.out.print(a + " " + b + " ");
		
		for(int i=3;i<=n;i++) {
			int c = a+b;
			System.out.print(c + " ");
			
			a = b;
			b = c;
		}
	}

}
