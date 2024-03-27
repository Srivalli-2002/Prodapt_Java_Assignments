package march25.string.assignment;
import java.util.Scanner;

public class Question4
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        
        String input = scanner.nextLine();
        System.out.println("Original String: " + input);
        
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) 
        {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            	
            left++;
            right--;
        }

        String reversed = new String(charArray);
        System.out.println("Reversed String: " + reversed);
    }
}