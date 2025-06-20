//Static and Instance methods in main method
public class AllMethods
{
    void getInstance() 
    {
        System.out.println("Instance method called in main method");
    }
    static void getStatic()
    {
       System.out.println("Static method called in main method");
    }
    public static void main(String[] args)
    {
        getStatic();
        AllMethods s=new AllMethods();
        s.getInstance();
    }
}
/*Output:
Static method called in main method
Instance method called in main method*/