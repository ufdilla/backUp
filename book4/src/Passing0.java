class Passing0 
{
    public static void swap (char operand1, char operand2)
    {
        char temp = operand1;
        operand1 = operand2;
        operand2 = temp;
    }
    public static void main(String[] args) 
    {
        char object1 = 'a';
        char object2 = 'b';
        System.out.println("Values before swapping: " + object1 + ", " + object2);
        swap (object1, object2);
        System.out.println("Values after swapping: " + object1 + ", " + object2);
    }
}
