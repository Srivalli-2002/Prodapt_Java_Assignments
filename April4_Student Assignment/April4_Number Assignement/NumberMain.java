package numberassignement;

import java.util.Scanner;

public class NumberMain {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		Number num = new Number();
		
		System.out.println("Enter a number to check whether its prime or not : ");
		System.out.println("Prints 0 for false and 1 for true : " + num.checkPrime(scan.nextInt()));  
        System.out.println();
        
        System.out.println("Enter a number to check whether its Amstrong or not : ");
        System.out.println(num.checkArmstrong(scan.nextInt()));  
        System.out.println();
        
        System.out.println("Enter a number to check whether its Palindrome or not : ");
        System.out.println(num.checkPalindrome(scan.nextInt())) ; 
	}
}
