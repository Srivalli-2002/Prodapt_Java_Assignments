package march28.fileAssignment;

import java.io.File;
import java.util.Scanner;

public class Question1Way1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Directory: ");
        String directory = scan.nextLine();
        
        String path = directory;
        File f1 = new File(path);
        if(f1.isDirectory())
        {
        	System.out.println("File is Directory");
        	System.out.println("");
        	File[] file1 = f1.listFiles();
			System.out.println("No.of files in the Directory : " + file1.length);
			System.out.println("");
			System.out.println("Files in the Directory : ");
			for(int i=0;i<file1.length;i++)
			{
				System.out.println(file1[i]);
			}
			
			System.out.println("");
			System.out.println("Enter Format: ");
	        String format = scan.nextLine();
	        
			for(int i=0;i<file1.length;i++)
			{
			
			if((file1[i].getAbsolutePath()).contains(format))
		    System.out.println(file1[i]);
			}
			
        }
        else
        {
        	System.out.println("File is not Directory");
        }
	}
}
