package march22.assignment;

//Assignment 1 - Question 4
import java.util.Scanner;

public class SearchArrayOfInteger 
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
		
		int array_size;
		System.out.print("Enter the size of an Array:");
		
		array_size=scan.nextInt();
		int arr[]=new int[array_size];
		System.out.println("Enter the Elements of an Array:");
		
		for(int i=0;i<array_size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the number to be searched:");
		
		int num=scan.nextInt();
		for(int i=0;i<array_size;i++)
		{
			if(arr[i]==num) System.out.println(num+" found at index "+i);
		}
	} 
}