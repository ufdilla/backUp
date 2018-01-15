public class Compare08
{ // assigning record-value without dynamic allocation
    public static void main(String[] args) 
    { // Memory is not dynamically allocated for integer-collection value
        Assign03 Object1 = new Assign03('a');
        Assign03 Object2 = Object1; // for object2
        Assign03 Object3 = new Assign03('a');
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
