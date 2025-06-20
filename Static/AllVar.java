//Static and Instance variables in main method
public class AllVar
{
    static int a=5;
    int b=20;
    public static void main(String[] args)
    {
        System.out.println("Static variable:"+a);
        AllVar s=new AllVar();
        System.out.println("Instance variable:"+s.b);
    }
}
/*Output:
Static variable:5
Instance variable:20 */