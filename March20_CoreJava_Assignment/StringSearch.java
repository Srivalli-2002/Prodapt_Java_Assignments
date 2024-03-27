package march22.assignment;

public class StringSearch extends AbstractSearch {
	public StringSearch() {
		super();
	}
	public StringSearch(String str) {
		super();
		this.str = str;
	}
	private String str;
	public String getStr() {
		return str;
	}
    public void setStr(String str) {
		this.str = str;
	}
	public boolean search(Object[] obj_list, Object obj) {
		 int found=0;
		    for(int i=0;i<obj_list.length;i++)
		    {
		    	if(obj_list[i].equals(obj)) found++;
		    }
		    if(found>0) return true;
		    else return false;
		
		}
}