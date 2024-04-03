package collectionsandgeneric;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Swap {
	 public static <T> T[] swap(T[] list, int firstPos, int secondPos)
	 {
		 T temp = list[firstPos];
	     list[firstPos] = list[secondPos];
	     list[secondPos] = temp;

	     return list;
	 }
	 
	 public static void main(String args[])
	 {
		 List<Integer> list1=new ArrayList<Integer>();
		 list1.add(36);
		 list1.add(56);
		 list1.add(68);
		 list1.add(77);
		  
		 List<String> list2=new ArrayList<String>();
		 list2.add("Rakesh Kumar");
		 list2.add("Srivalli");
		 list2.add("Jahnavi");
		 list2.add("Aadhya");
		 
		 List<Float> list3=new ArrayList<Float>();
		 list3.add(56.12f);
		 list3.add(45.23f);
		 list3.add(26.235f);
		 list3.add(78.67f);
			
		 List<Double> list4=new ArrayList<Double>();
		 list4.add(33.89d);
		 list4.add(37.83d);
		 list4.add(73.09d);
		 list4.add(77.55d);
		 
		 @SuppressWarnings("rawtypes")
		 List[] list=new List[4];
	     list[0]=list1;
		 list[1]=list2;
		 list[2]=list3;
		 list[3]=list4;
		 
		 for(int index=0;index<list.length;index++)
		 {
			 System.out.println(list[index]);
		 }
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the first position : ");
			
		 int firstPos=scan.nextInt();
		 System.out.println("enter the Second position : ");
			
		 int secondPos=scan.nextInt();
		 
		 if(swap(list,firstPos,secondPos)!=null)
		 {
			 System.out.println("After Swaping");
			 for(int index=0;index<list.length;index++)
			 {
				 System.out.println(list[index]);
			 }
	     }
	     scan.close();
	 }
} 
