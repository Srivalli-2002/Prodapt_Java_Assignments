package march22.assignment;

public class Parallelogram extends Quadrilateral{
	 
	@Override
	public int area() {
		// TODO Auto-generated method stub
		return(height*base);
	}
	public Parallelogram(int a,int b )
	{   this.base=a;
		this.height=b;
		
	}
 
}