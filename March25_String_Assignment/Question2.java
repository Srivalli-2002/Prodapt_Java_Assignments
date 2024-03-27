package march25.string.assignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = scanner.nextLine();
		String str = str1.toUpperCase();
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		char[] vowels={'A','E','I','O','U'};
		for(int i=0;i<vowels.length;i++) 
		{
			int count=0;
			for(int j=0;j<str.length();j++) 
			{
				if(str.charAt(j)== vowels[i]) 
				{
					count++;
				}
			}
			if(count>0) 
				System.out.println(vowels[i]+" - "+count);
		}
		
		char[] consonants={'B','c','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
		for(int i=0;i<consonants.length;i++) 
		{
			int count=0;
			for(int j=0;j<str.length();j++) 
			{
				if(str.charAt(j)== consonants[i]) 
				{
					count++;
				}
			}
			if(count>0) 
				System.out.println(consonants[i]+" - "+count);
		}
		
		for(int index=0; index<str.length(); index++)
		{
			if(str.charAt(index)=='A'|| str.charAt(index)=='E'|| str.charAt(index)=='I'|| str.charAt(index)=='O' ||str.charAt(index)=='U')
			{
				vowelCount++;
			}
			else if(str.charAt(index) >= 'A' && str.charAt(index) <= 'Z')
			{
				consonantCount++;
			}
		}
		System.out.println("No.of Vowels " + vowelCount);
		System.out.println("No.of Consonants " + consonantCount);
	}

}
