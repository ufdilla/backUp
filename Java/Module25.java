class Module25
{
  public static void operation1 (boolean operand)
  { System.out.println ("A procedure operation1"); }
  
  public static int operation1 (boolean operand)
  { System.out.println ("A procedure operation1"); }
  
  public static void main (String[] args)
  {
	operation1 (false);
	int object1 = operation1 (true);
  }
}