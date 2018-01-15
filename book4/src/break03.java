public class break03 
{ // about repetition-operation; for
    public static void main(String[] args) 
    {
        int[] Object1 = new int [] {9, 8, 7, 6, 5};
        int counter, cout = Object1.length;
        for (counter = 0; counter < cout; counter++)
            if (counter == 2)
                break;
            else
                System.out.println(Object1[counter]);
        System.out.println();
    }
}
