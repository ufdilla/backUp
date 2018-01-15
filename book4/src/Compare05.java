public class Compare05
{ // assigning record-value without dynamic allocation
    public static void main(String[] args) 
    { // Memory is not dynamically allocated for integer-collection value
        String Object1 = "A string value";
        String Object2 = Object1; // for object2
        String Object3 = "A string value";
        if (Object1 == Object2)
            System.out.println("Equal record-value");
        else
            System.out.println("Distinc record-Value");
        if (Object1 == Object3)
            System.out.println("Equal record-value");
        else
            System.out.println("Distinc record-Value");
    }    
}
