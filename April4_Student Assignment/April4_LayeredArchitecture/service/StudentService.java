package studentassignment.service;

import java.util.List;

import studentassignment.exceptions.DataNotPresentException;
import studentassignment.exceptions.StudentNotFoundException;
import studentassignment.model.Student;

public interface StudentService {

	//Add student
	//Access Modifier Return Type Name of the method
	//(Method accepts Student type argument)
	public String addStudent(Student student) throws DataNotPresentException;
	public List<Student> displayStudent();
	public List<Student> displayStudentByCity(String city) throws StudentNotFoundException;
	public List<Student> displayStudentById(Integer id) throws StudentNotFoundException;
	
}