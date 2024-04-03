package collectionsandgeneric;

public class FriendshipCriteria<T,S>{
	private T t;
	private S s;
	
	public FriendshipCriteria() {
		// TODO Auto-generated constructor stub
	}

	public FriendshipCriteria(T t, S s) {
		super();
		this.t = t;
		this.s = s;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public S getS() {
		return s;
	}

	public void setS(S s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "FriendshipCriteria [t = " + t + ", s = " + s + "]";
	}
	
	
}
