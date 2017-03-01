public class ClientStack
{
	public static void main(String[] args)
	{
            try
            {
//		IStack s = new Stack1(4);
		IStack s = StackFactory.make(args);
		System.out.println(s.is_empty());
		System.out.println(s.is_full());

		s.push(11);
		s.push(22);

		System.out.println(s.is_empty());
		System.out.println(s.is_full());

		s.push(33);
		s.push(44);

		// s.push(55);

		System.out.println(s.is_empty());
		System.out.println(s.is_full());

		for(int i = 0; i < 4; ++i)
			System.out.println(s.pop());

		// s.pop();
            }
	    catch(Exception e)
	    {
			System.out.println(e);
	    }
		
	
	}
}