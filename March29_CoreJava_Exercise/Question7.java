package march29.corejava.assignment;

import java.util.Scanner;

public class Question7 {
	public static int smallArr(int[] arr, int index, int small)
	{
		if(index == arr.length)
		return small;
		if(arr[index] < small)
			small=arr[index];
		
		return smallArr(arr, index+1, small);
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
		int SmallArray = smallArr(arr,0,arr[0]);
		System.out.println("Smallest array element : " + SmallArray);
	}
}