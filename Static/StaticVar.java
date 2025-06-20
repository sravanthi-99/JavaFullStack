//Static variable in static methods
public class StaticVar
{
    int a=5;
    int b=5;
    void add() 
    {
        System.out.println("Static variable in instance methods");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
       StaticVar s=new StaticVar();
       s.add();
    }
}
/*Output:
Static variable in instance methods
a=5
b=5
10*/