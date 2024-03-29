package march29.corejava.assignment;
import java.util.Scanner;
public class Question6 {

	public static int arrSum(int[] arr, int index)
	{
		if(index>=arr.length)
		{
			return 0;
		}
		return arr[index]+arrSum(arr,index+1);
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
		int sum = arrSum(arr,0);
		System.out.println("Sum of array elements : " + sum);
	}

}
