public class Compare09
{ // assigning record-value without dynamic allocation
    static boolean equals (int[] A, int[] B)
    {
        if (A.length != B.length)
            return (false);
        short counter, cout = (short) A.length;
        for (counter = 0; counter < cout; counter++)
            if(A[counter] != B[counter])
                return (false);
        return (true);
    }
    public static void main(String[] args) 
    { // Memory is not dynamically allocated for integer-collection value
        int[] Object1 = new int[] {1, 2};
        int[] Object2 = new int[] {1, 2};
        Assign03 Object3 = new Assign03('a');
        Assign03 Object4 = new Assign03('a');
        if (Object3.column1 == Object4.column1)
            System.out.println("Equal record-value");
        else
            System.out.println("Distinc record-Value");
    }    
}
