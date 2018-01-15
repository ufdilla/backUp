public class Compare02
{ // assigning record-value without dynamic allocation
    public static void main(String[] args) 
    { // Memory is not dynamically allocated for integer-collection value
        Assign00 Object1 = new Assign00();
        Assign00 Object2 = Object1; // for object2
        Assign00 Object3 = new Assign00();
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
