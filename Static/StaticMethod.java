//Static method in instance methods
public class StaticMethod
{
    static int a=5;
    static int b=5;
    static void add()
    {
       System.out.println(a+b);
    }
    void getStatic() 
    {
        System.out.println("Static method in instance methods");
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        StaticMethod s=new StaticMethod ();
       s.getStatic();
    }
}
/*Output:
Static method in instance methods
10*/