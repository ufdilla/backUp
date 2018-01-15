import java.util.Scanner;
import java.util.InputMismatchException;

class Error02
{
  public static void main (String[] Lined_operands)
  {
	Scanner An_input_device = new Scanner (System.in);
	System.out.print ("Please input the numerator value : ");
	int numerator = An_input_device.nextInt();
	System.out.print ("Please input the denominator value : ");
	int denominator = An_input_device.nextInt();
	try
	{
	  double result = numerator / denominator;
	  System.out.printf ("\nResult: %d / %d == %5.2f\n");
	}
	catch (InputMismatchException A_mismatch_error)
	{ System.err.printf ("\nError: %s", A_mismatch_error); }
	catch (ArithmeticException Math_errr)
	{
	  System.err.printf ("\nError: %s", Math_errr);
	  System.out.println ("Denominator must be nonzer0");
	}
  }
}