package march22.assignment;
public abstract class Quadrilateral {
    int base;
    int height;
    //GETTERS AND SETTER
    public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
 	//ABSRTRACT CLASS
 	public abstract int area();
 
}
