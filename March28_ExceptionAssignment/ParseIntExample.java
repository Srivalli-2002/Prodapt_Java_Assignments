package march28.exception.assignment;
import java.util.Scanner;

public class ParseIntExample {
	public static void main(String[] args) {
		int val,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		Scanner scanLine=new Scanner(scan.nextLine());
		try {
			while(scanLine.hasNext()) {
			val=Integer.parseInt(scanLine.next());
			sum=sum+val;
			}
		}
		catch (NumberFormatException e)
		{
			
		}
		finally {
			System.out.println("The sum of integers on this line is "+sum);
		}
		scan.close();
	}
 
}
