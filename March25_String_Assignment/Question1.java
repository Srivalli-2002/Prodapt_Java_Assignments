package march25.string.assignment;
import java.util.Scanner;


public class Question1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int digit=0;
	    int alpha=0;
	    System.out.println("String is : "+input);
	    for(int index=0;index<input.length();index++)
	    {
	       if(Character.isDigit(input.charAt(index))) digit++;
	       else if (Character.isAlphabetic(input.charAt(index))) alpha++;
	       
	    }
	   if(digit==input.length())System.out.println("It contains only Digits");
	   else if (alpha==input.length())System.out.println("It contains only Alphabets");
	   else System.out.println("It contains both Digits and alphabets");
 
	}
}