//Instance variable in static methods
public class InstanceVar
{
    int a=5;
    int b=5;
    static void add() 
    {
        InstanceVar s=new InstanceVar();
        System.out.println("Instance variable in static methods");
        System.out.println("a="+s.a);
        System.out.println("b="+s.b);
        System.out.println(s.a+s.b);
    }
    public static void main(String[] args)
    {
        
       add();
    }
}
/*Output:
Instance variable in static methods
a=5
b=5
10 */