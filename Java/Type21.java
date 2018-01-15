class Type21 extends Type20
{
  public char column2;
  
  Type21 (char operand2)
  {
	super (true);
	this.column2 = operand2;
  }
  
  public static void main (String[] args)
  {
	Type21 RecObject1 = new Type21('b');
	RecObject1.operation1();
	System.out.println (RecObject.column2);
  }
}