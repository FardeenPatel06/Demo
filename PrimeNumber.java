package W3JavaQues;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number to check");
     int num=sc.nextInt();
     if(isprime(num)) {
    	 System.out.println("is a prime number");
     }else {
    	 System.out.println("not a prime number");
     }
      }
	static boolean isprime(int num) {
		if (num<=1) { 
          return false; //Numbers less than or equal to 1 are not prime.


		}
		for(int i=2;i<=Math.sqrt(num);i++) {
            if (num % i == 0) {
            	return false; //The loop runs from 2 to the square root of the number.
            	//If the number is divisible by any of these values, it’s not prime.


            }

		
	}
		return true;
	}
	
	
	
	}


