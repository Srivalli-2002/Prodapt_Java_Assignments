package march22.assignment;

public class QuadTest {

	public static void main(String[] args) {
		Quadrilateral sq = new Square (4);
		System.out.println("Area of Square : " + sq.area());
		
		Quadrilateral para = new Parallelogram (6,8);
		System.out.println("Area of Square : " + para.area());
		
		Quadrilateral rec = new Rectangle (4,8);
		System.out.println("Area of Square : " + rec.area());

	}

}
