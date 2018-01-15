public class Error03
{
  public static void main (String[] Lined_operands)
  {
	try
	{ DoesRaiseError(); }
	catch (Exception Error1)
	{ System.err.println ("Error handle in operation main"); }
	
	DoesNotRaiseError();
  }
  
  public static void DoesRaiseError () throws Exception
  {
	try
	{
	  System.out.println ("This operation raises error");
	  throw new Exception(); //dynamically creates an object of type Exception
	}
	catch (Exception Error2)
	{
	  System.out.println ("Error handle in the operation DoesRiseError");
	  throw Error2; // throw is a declarativ-operation
	}
	finally
	{ System.err.println ("Finally executed in the operation DoesRaiseError"); }
  }
  
  public static void DoesNotRaiseError ()
  {
    try
	{ System.out.println ("Operation DoesNotRaiseError"); }
	catch (Exception Error3)
	{ System.out.println (Error3); }
	finally
	{ System.err.println ("finally executed in the operation DoesNotRaiseError"); }
	
	System.out.println ("End of operation DoesNotRaiseError");
  }
}