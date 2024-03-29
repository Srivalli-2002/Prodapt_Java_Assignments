package march29.corejava.assignment;

import java.util.Scanner;

public class Question8 {
	
	public static int smallIndex(int[] arr)
	{
		int smallIndex = 0;
		int smallValue = arr[0];
		for(int index=0; index<arr.length; index++)
		{
			if (arr[index] < smallValue)
			{
				smallValue = arr[index];
				smallIndex = index;
			}
		}
		return smallIndex;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of an array:");
		for(int index=0; index<arr.length; index++)
		{
			arr[index] = scan.nextInt();
		}
		int SmallArrayIndex = smallIndex(arr);
		System.out.println("Smallest array index : " + SmallArrayIndex);
	}
}