package collectionsandgeneric;

public class T implements Comparable{
	public String t;

	public T() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T(String t) {
		super();
		this.t = t;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}
	
	public int compareTo(Object o)
	{
		if(this.t.equals(o))
			return 1;
		else return 0;
	}
}
