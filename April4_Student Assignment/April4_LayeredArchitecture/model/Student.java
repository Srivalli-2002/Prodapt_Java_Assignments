package studentassignment.model;

public class Student 
{
	private Integer id;
	private String name;
	private String city;
	
	//Non-parameterized Constructor
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public Student(Integer id, String name, String city) 
	{
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	//Getter and Setter methods
	public Integer getId() 
	{
		return id;
	}

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	//To String method
	@Override
	public String toString() 
	{
		return "Student [id = " + id + ", name = " + name + ", city = " + city + "]";
	}
	
	
}
