import java.util.scanner;

class Error01
{
  public static void main (String[] args)
  {
	Scanner An_input_device = new Scanner (System.in);
	System.out.print ("Please input the numerator value : ");
	int numerator = An_input_device.nextInt();
	System.out.print ("Please input the denominator value : ");
	int denominator = An_input_device.nextInt();
	double result = numerator / denominator;
	System.out.printf ("\nResult: %d / %d == %5.2f\n");
  }
}