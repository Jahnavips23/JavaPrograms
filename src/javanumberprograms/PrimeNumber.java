/* A prime number is a number that is divisible only by:  1 and Itself
Examples: 2, 3, 5, 7, 11
Not prime: 4, 6, 8, 9 
*/

package javanumberprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		boolean isPrime = true;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(num <= 1) {
            System.out.println("Not a Prime Number");
        }
        else if(isPrime) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
    }
}
