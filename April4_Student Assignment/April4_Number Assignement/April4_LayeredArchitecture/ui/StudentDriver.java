package studentassignment.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;
import studentassignment.service.StudentService;
import studentassignment.service.StudentServiceImpl;

public class StudentDriver {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws StudentNotFoundException
	{
		Student stud1 = new Student();
		stud1.setId(1);
		stud1.setName("MS Dhoni");
		stud1.setCity("Ranchi");
		Student stud2 = new Student(2,"SKY","Lucknow");
		Student stud3 = new Student(3,"R Ashwin","Chennai");
		Student stud4 = new Student(4,"Ishan Kishan","Patna");
		Student stud5 = new Student(5,"Virat Kohli","New Delhi");
		Student stud6 = new Student(6,"Rohit Sharma","New Delhi");
		Student stud7 = new Student(7,"Irfan Pathan","Ahmedabad");
		Student stud8 = new Student(8,"Srivalli","Hyderabad");
		Student stud9 = new Student(9,"Rakesh","Visakhapatnam");
		Student stud10 = new Student(10,"Supriya","Hyderabad");
		Student stud11 = new Student(11,"Aadhya","Badrachalam");
		Student stud12 = new Student(12,"Jahnavi","Cheerala");
		Student stud13 = new Student(13,"Teena","Banglore");
		Student stud14 = new Student(14,"Pragna","Vijayawada");
		Student stud15 = new Student(15,"Jyothsna","Pidugurala");
		
		StudentService studentService = new StudentServiceImpl();
		
		List<Student> studentList = Arrays.asList(stud1,stud2,stud3,stud4,stud5,stud6,stud7,stud8,stud9,stud10,stud11,
												  stud12,stud13,stud14,stud15);
		for (Student student : studentList) {
			try {
				System.out.println(studentService.addStudent(student));
			} catch (DataNotPresentException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println();
		
		List<Student> stud = studentService.displayStudent();
		System.out.println("----------------LIST OF STUDENTS-----------------");
		stud.forEach(System.out::println);
		
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------LIST OF STUDENTS BY CITY-------------");
		System.out.println("Enter City : ");
		try 
		{
			List<Student> city = studentService.displayStudentByCity(scan.nextLine());
			city.forEach(System.out::println);
		}
		catch(StudentNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		System.out.println("-------------------SORTING BY NAME-----------------");
		Collections.sort(studentList,Comparator.comparing(Student::getName));
		studentList.forEach(System.out::println);
		System.out.println();
		
		System.out.println("-------------------SORTING BY CITY-----------------");
		Collections.sort(studentList,Comparator.comparing(Student::getCity));
		studentList.forEach(System.out::println);
		System.out.println();
		
		System.out.println("------------LIST OF STUDENTS BY ID-------------");
		System.out.println("Enter Student ID : ");
		try 
		{
			List<Student> id = studentService.displayStudentById(scan.nextInt());
			id.forEach(System.out::println);
		}
		catch(StudentNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
