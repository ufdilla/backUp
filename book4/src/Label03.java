public class Label03
{
    public static void main(String[] args) 
    {
        short i, j;
    level2:
        for(i = 1; i < 5; i++)      // repetition level 2
        {
            System.out.println("i == " + i);
        level1:
            for(j = 1; j < 5; j++)      // repetition level 2
            {
                if(i == j)
                    continue level1; // same as break(1)
                else if ( i == 4 && j == 3)
                    continue level2;
                System.out.println("j == " + j);
            }
        }
    }
    
}
