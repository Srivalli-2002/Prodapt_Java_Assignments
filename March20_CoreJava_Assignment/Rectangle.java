package march22.assignment;

public class Rectangle extends Quadrilateral {
	 
	@Override
	public int area() {
		// TODO Auto-generated method stub
		return(height*base);
	}
	public Rectangle(int b,int h )
	{   this.base=b;
		this.height=h;
		
	}
 
}