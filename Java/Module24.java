class Module24
{
  public static void operation1(boolean operand)
  {}
  
  public static void operation1(byte opernad)
  {
	System.out.println("Byte operand " + operand);
  }
  
  public static void operation1(char operand)
  {}
  
  public static void operation1(double operand)
  {}
  
  public static void operation1(float operand)
  {}
  
  public static void operation1(int opernad)
  {
	System.out.println("Integer operand " + operand);
  }
  
  public static void operation1(long opernad)
  {
	System.out.println("Long operand " + operand);
  }
  
  public static void operation1(short opernad)
  {
	System.out.println("Short operand " + operand);
  }
  
  public static void main (String[] args)
  {
	operation1(true);
	operation1((byte)1);
	operation1('c');
	operation1(1.25);
	operation1(2.5f);
	operation1(123);
	operation1(12L);
	operation1((short)12);
  }
}