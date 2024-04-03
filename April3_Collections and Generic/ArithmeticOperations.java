package collectionsandgeneric;

import java.util.List; 
import java.util.Vector; 

public class ArithmeticOperations 
{ 
	public static <T extends Number> Number add(T t1, T t2) 
	{ 
		return (t1.doubleValue() + t2.doubleValue()); 
	} 
	
	public static <T extends Number> Number sub(T t1, T t2) 
	{ 
		return (t1.doubleValue() - t2.doubleValue()); 
	} 
	
	public static <T extends Number> Number div(T t1, T t2) 
	{ 
		return (t1.doubleValue() / t2.doubleValue()); 
	} 
	
	public static <T extends Number> Number add(List<? extends Number> list) 
	{
		double d = 0;
		for (int i = 0; i < list.size(); i++)
			d += list.get(i).doubleValue(); 
	 
		return d; 
	} 
	public static <T extends Number> Number sub(List<? extends Number> list) 
	{
		double d = list.get(0).doubleValue();
		for (int i = 1; i < list.size(); i++)
			d -= list.get(i).doubleValue(); 
	 
		return d; 
	} 
	public static <T extends Number> Number div(List<? extends Number> list) 
	{
		double d = list.get(0).doubleValue();
		for (int i = 1; i < list.size(); i++)
			d /= list.get(i).doubleValue(); 
	 
		return d; 
	} 
	 
	public static void dumpList(List<?> list) 
	{
		System.out.println("List dump with unbounded wildcard:"); 
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i)); 
	} 
	
	public static void main(String[] args) 
	{ 
		// Adding 2 integers
		System.out.println("-------Addition-------");
		Integer i1 = 34, i2 = 43; 
		System.out.println("Add with generic method : " + ArithmeticOperations.add(i1, i2)); 
		Float f1 = 12.56f, f2 = 3.6778f; 
		System.out.println("Add with generic method : " + ArithmeticOperations.add(f1, f2)); 
		
		// Adding 2 integers through a list
		Vector<Number> l1 = new Vector<Number>(); 
		l1.add(34); 
		l1.add(43); 
		System.out.println("Add with upper bounded wildcard : " + ArithmeticOperations.add(l1)); 
		System.out.println();
		
		System.out.println("-------Subtraction-------");
		// Subtracting 2 integers
		System.out.println("Subtract with generic method : " + ArithmeticOperations.sub(i1, i2));
		System.out.println("Add with generic method : " + ArithmeticOperations.sub(f1, f2)); 
		
		// Subtarcting 2 integers through a list
		System.out.println("Add with upper bounded wildcard : " + ArithmeticOperations.sub(l1));
		System.out.println();
		
		System.out.println("-------Division-------");
		//Divide 2 integers
		System.out.println("Divide with generic method : " + ArithmeticOperations.div(i1, i2));
		System.out.println("Add with generic method : " + ArithmeticOperations.div(f1, f1)); 
		
		// Subtarcting 2 integers through a list
		System.out.println("Add with upper bounded wildcard : " + ArithmeticOperations.div(l1));
		System.out.println();
				
		// Dumping the list to the console.
		ArithmeticOperations.dumpList(l1); 
	 } 
} 