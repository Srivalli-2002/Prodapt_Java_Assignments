package march22.assignment;


// Assignment 1 - Question 1
public class SuperStudy  
{ 
		public void X() 
		{ 
			System.out.println("I am in SuperStudy.X()"); 
		} 
		public static void main(String[] args)  
		{  
			SuperStudyChild ssc = new SuperStudyChild(); 
			ssc.X();  
		} 
} 

class SuperStudyChild extends SuperStudy 
{ 
		public void X() 
		{  
			//X(); 
			System.out.println("I am in SuperStudyChild.X()");  
		} 
} 

//  a. What is the problem?  --> recursion happens
//  b. How can we rectify the problem?   --> by commenting line number 20.