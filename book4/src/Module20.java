public class Module20 
{
    int column1; // not yet explained why it is a column
    
    private void operation1() // looks like nullary operation
    {
        System.out.println(column1);
    }
    private void operation2 (/*Module20 this*/)
    { // similiar, look like nullary operation
        System.out.println(this.column1);
    }
   public static void main(String[] args) 
   {
       Module20 RecObject1 = new Module20();
       RecObject1.column1 = 1;
       Module20 RecObject2 = new Module20();
       RecObject2.column1 = 2;
       RecObject1.operation1(); // operation1 (RecObject1);
       RecObject2.operation1(); // operation1 (RecObject2);
       RecObject1.operation2(); // operation2 (RecObject1);
       RecObject2.operation2(); // operation2 (RecObject2);
   }
}
