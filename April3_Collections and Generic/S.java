package collectionsandgeneric;

public class S<N> implements Comparable {
	public N s;

	public S() {
		super();
		// TODO Auto-generated constructor stub
	}

	public S(N s) {
		super();
		this.s = s;
	}

	public N getS() {
		return s;
	}

	public void setS(N s) {
		this.s = s;
	}

	@Override
	public int compareTo(Object o)
	{
		if(this.s.equals(o))
			return 1;
		else return 0;
	}
}
