public class Passing1
{
    public static void swap (char[] operand1, char[] operand2)
    {
        char temp = operand1[0];
        operand1[0] = operand2[0];
        operand2[0] = temp;
    }
    public static void main(String[] args) 
    {
        char[] object1 = new char[1];
        char[] object2 = new char[1];
        object1[0] = 'a';
        object2[0] = 'b';
        System.out.println("Values before swapping: " + object1[0] + ", " + object2[0]);
        swap (object1, object2);
        System.out.println("Values after swapping: " + object1[0] + ", " + object2[0]);
    }
}
