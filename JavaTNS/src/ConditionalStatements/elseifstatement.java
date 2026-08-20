package ConditionalStatements;

public class elseifstatement {
	String skill="java";
	public void programming_language()
	{
		if(skill=="python")
		{
		System.out.println("I have already learned python");	
		}
		else if(skill=="mysql") 
		{
			System.out.println("It is a database");
		}
		else  if(skill=="java") 
		{
			System.out.println("I am learning java");
		}
		else
		{
			System.out.println("I don't have any idea on it");
		}
	}

}
