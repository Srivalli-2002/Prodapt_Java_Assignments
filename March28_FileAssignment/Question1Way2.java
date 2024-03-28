package march28.fileAssignment;
import java.io.File;
import java.util.Scanner;

public class Question1Way2 { 

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Directory: ");
        String directory = scan.nextLine();
        System.out.println("Enter the folder: ");
        String folder = scan.nextLine();
        System.out.println("Enter the file name: ");
        String fileName = scan.nextLine();
		System.out.println("Enter the format of a file: ");
        String fileFormat = scan.nextLine();
        String path = directory + ":\\\\" + folder + "\\\\" + fileName + "." + fileFormat;
        File f1 = new File(path);
        System.out.println("Path of the file : " + path);
        if(f1.exists())
        {
        	System.out.println("File already exists");
        }
        else
        {
        	System.out.println("File doesn't exists");
        }
	}

}
