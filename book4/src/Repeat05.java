public class Repeat05
{ // about repetition-operation; while
    public static void main(String[] args) 
    {
        int[] Object1 = new int [] {9, 8, 7, 6, 5};
        int counter = 0, cout = Object1.length;
        while (counter < cout)
        {
            System.out.println(Object1[counter]);
            counter++;
        }
        System.out.println();
    }
}