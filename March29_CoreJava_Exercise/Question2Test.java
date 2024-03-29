package march29.corejava.assignment;

public class Question2Test

{

	public static void main(String[] args)
	
	{ 
		int [] nInPack = {5,10,10};
	
		Question2 [][] pack = new Question2[3][];
		
		for(int i=0;i<pack.length;i++)
		{
		
			pack[i] = new Question2[nInPack[i]];
		
			for(int j=0;j<pack[i].length;j++)
			{
			
			pack[i][j] = new Question2(0.5,"Formular"+i+j);
		
			}
	
		}
	System.out.println(Question2.nCapsules);

	}

}