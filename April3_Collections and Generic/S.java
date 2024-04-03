package collectionsandgeneric;

public class S {
	public String s;

	public S() {
		super();
		// TODO Auto-generated constructor stub
	}

	public S(String s) {
		super();
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	public int compareTo(Object o)
	{
		if(this.s.equals(o))
			return 1;
		else return 0;
	}
}
