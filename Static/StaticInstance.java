//static and instance members
public class StaticInstance
{
    static int a=10;
    static int b=20;
    int c=30;
    int d=5;
    static void add() 
    {
        System.out.println("static methods directly by function name");
        System.out.println(a+b);
        System.out.println(a);
    }
    static void sub() 
    {
        System.out.println("static method by class name");
        System.out.println(a-b);
        System.out.println(b);
    }
    void mul() 
    {
        System.out.println("Instance method call by an obj");
        System.out.println(c*d);
        System.out.println(c);
    }
    void div() 
    {
        System.out.println(c/d);
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        add();
        sub();
        StaticInstance s=new StaticInstance();
        s.mul();
        s.div();
    }
}
/*Output:
static methods directly by function name
30
10
static method by class name
-10
20
Instance method call by an obj
150
30
6
5*/