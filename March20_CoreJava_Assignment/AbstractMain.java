package march22.assignment;

public class AbstractMain {
	 
	
	public static void main(String[] args) {
		AbstractSearch obj1=new IntegerSearch(1);
		AbstractSearch obj2=new IntegerSearch(1);
		AbstractSearch obj3=new IntegerSearch(6);
		AbstractSearch obj4=new IntegerSearch(9);
		AbstractSearch obj5=new IntegerSearch(3);
		AbstractSearch obj6=new IntegerSearch(8);
		
		Object[] obj_list= new Object[5];
		 obj_list[0]=obj1;
		 obj_list[1]=obj2;
		 obj_list[2]=obj3;
		 obj_list[3]=obj4;
		 obj_list[4]=obj5;
		 
		 IntegerSearch test = new IntegerSearch();
		 System.out.println(test.search(obj_list,obj2));	
		 System.out.println(test.search(obj_list,obj6));
		 System.out.println("****************************************************");
		 
		 AbstractSearch sobj1=new StringSearch("Rakesh Kumar");
		 AbstractSearch sobj2=new StringSearch("Srivalli");
		 AbstractSearch sobj3=new StringSearch("Jahnavi");
		 
		 Object[] obj_list_string= new Object[3];
		 obj_list_string[0]=sobj1;
		 obj_list_string[1]=sobj2;
		 obj_list_string[2]=sobj3;
		 StringSearch tests=new StringSearch();
		 System.out.println(tests.search(obj_list_string,sobj2));	
	 }

}