package collectionsandgeneric;

public class T<M> implements Comparable{
	public M t;

	public T() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T(M t) {
		super();
		this.t = t;
	}

	public M getT() {
		return t;
	}

	public void setT(M t) {
		this.t = t;
	}

	@Override
	public int compareTo(Object o)
	{
		if(this.t.equals(o))
			return 1;
		else return 0;
	}
}
