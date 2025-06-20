 //Instance method in static methods
public class InstanceMethod
{
    int a=5;
    int b=5;
    void add() 
    {
        System.out.println(a+b);
    }
    static void getInstance()
    {
        System.out.println("Instance methods in static methods");
        InstanceMethod s=new InstanceMethod();
        s.add();
    }
    public static void main(String[] args)
    {
       getInstance();
    }
}
/*Output:
Instance methods in static methods
10*/