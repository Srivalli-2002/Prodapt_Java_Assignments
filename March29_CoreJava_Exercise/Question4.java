package march29.corejava.assignment;
import java.util.Arrays;
import java.util.Random;
public class Question4 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Random random = new Random();
		for(int i=0; i<10; i++)
		{
			arr[i] = random.nextInt(0,100);
		}
		System.out.println("Original Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println("Sorted Array: ");
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
