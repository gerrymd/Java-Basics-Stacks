public class StackFactory
{
	public static IStack make(String[] name)
	{
		 
		if(name[0].equals("Stack1"))
			return new Stack1(Integer.parseInt(name[1]));
		else if(name[0].equals("Stack2"))
			return new Stack2();
		else 
			return null;
	} 
}