package studentassignment.dao;


import java.util.ArrayList;
import java.util.List;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;

	public class StudentDAOImpl implements StudentDAO
	{
		static List<Student> studentList = new ArrayList<Student>(); 
		
		@Override
		public String addStudent(Student student) throws DataNotPresentException {
			// TODO Auto-generated method stub
			if(student != null)
			{
				studentList.add(student);
				return "Student with Student ID : " + student.getId() + " Added Successfully";
			}
			else
			{
				return "Unable to add Student as no data was provided";
			}
			
		}
		
		@Override
		public List<Student> displayStudent()
		{
			List<Student> studList = new ArrayList<Student>();
			for(Student student : studentList)
			{
				studList.add(student);
			}
			return studList;
		}
		
		
		@Override
		public List<Student> displayStudentByCity(String city) throws StudentNotFoundException {
			List<Student> cityStudentList = new ArrayList<Student>();
			for(Student student : studentList)
			{
			if(student.getCity().equalsIgnoreCase(city))
			{
				cityStudentList.add(student);
			}
			}
			if(cityStudentList.isEmpty())
			{
				throw new StudentNotFoundException("Student with city -- " + city + " doesn't exists");
			}
			else 
				return cityStudentList;
		}

		@Override
		public List<Student> displayStudentById(Integer id) throws StudentNotFoundException {
			List<Student> idStudentList = new ArrayList<Student>();
			for(Student student : studentList)
			{
			if(student.getId()== id)
			{
				idStudentList.add(student);
			}
			}
			if(idStudentList.isEmpty())
			{
				throw new StudentNotFoundException("Student with city -- " + id + " doesn't exists");
			}
			else 
				return idStudentList;
		}
	}
