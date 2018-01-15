class Type19 extends Type18
{
  public char column2;
  
  Type19(char operand2)
  {
	super(true);
	this.column2 = operand2;
  }
  
  public static void main (String[] args)
  {
	Type19 RecObject1 = new Type19('b');
	System.out.println (RecObject1.column2);
  }
}