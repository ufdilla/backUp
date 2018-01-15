public class Generic02 
{
    static void Insert (Object[] Operand1, Object operand2, int subscript)
    {
        Operand1[subscript] = operand2;
    }
    
    public static void main(String[] args) 
    {
        boolean object1 = true;
        byte object2 = 1;        
        char object3 = 'c';
        double object4 = 1.5;
        float object5 = -0.5f;
        int object6 = 6;
        long object7 = 7l;
        short object8 = (short)8;
        Object[] Arrayobject1 = new Object[8];
        Insert (Arrayobject1, object1, 0);
        Insert (Arrayobject1, object2, 1);
        Insert (Arrayobject1, object3, 2);
        Insert (Arrayobject1, object4, 3);
        Insert (Arrayobject1, object5, 4);
        Insert (Arrayobject1, object6, 5);
        Insert (Arrayobject1, object7, 6);
        Insert (Arrayobject1, object8, 7);
        for (int counter = 0; counter < Arrayobject1.length; counter++)
            System.out.println(Arrayobject1[counter]);
    }
}
