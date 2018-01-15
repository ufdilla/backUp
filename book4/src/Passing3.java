public class Passing3
{
    private static NotEmpty temp  = new NotEmpty(' ');
    public static void swap (NotEmpty operand1, NotEmpty operand2)
    {
        NotEmpty temp = new NotEmpty(' ');
        temp.column1 = operand1.column1;
        operand1.column1 = operand2.column1;
        operand2.column1 = temp.column1;
    }
    public static void main(String[] args) 
    {
        NotEmpty object1 = new NotEmpty('a');
        NotEmpty object2 = new NotEmpty('b');
        System.out.println("Values before swapping: " + object1.column1 + ", " + object2.column1);
        swap (object1, object2);
        System.out.println("Values after swapping: " + object1.column1 + ", " + object2.column1);
    }
}
