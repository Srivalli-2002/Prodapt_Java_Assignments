package march22.assignment;

public class IntegerSearch extends AbstractSearch
{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	

	public IntegerSearch(int num) {
		super();
		this.num = num;
	}
	public IntegerSearch() {
	}

	public boolean search (Object[] obj_list, Object obj) 
	{
	int elementfound = 0;
	for(int index = 0; index < obj_list.length; index++)
	{
		if(obj_list.equals(obj))
			elementfound++;
	}
	if(elementfound>0) return true;
	else return false;
	}
}
