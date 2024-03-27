package march22.assignment;

public class Square extends Quadrilateral{
		
		@Override
		public int area() {
			// TODO Auto-generated method stub
			return(height*base);
		}
		public Square(int side)
		{   this.base=side;
			this.height=side;
			
		}	 
}