package collectionsandgeneric;


public class FriendshipCriteriaDemo {
	public static void main(String args[]) {
		String name = "Srivalli";
		Integer age = 22;
		String location = "Hyderabad";
		
		//b
		FriendshipCriteria<String,Integer> pair1 = new FriendshipCriteria<String,Integer>(name,age);
		System.out.println(pair1);
		
		//c
		FriendshipCriteria<String,String> pair2 = new FriendshipCriteria<String,String>(name,location);
		System.out.println(pair2);
	}
	
}
