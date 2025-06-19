//Local and global variable
public class LocalGlobal
{
 int n=10;
 public static void main(String[] args)
 {
  int g=20;
  LocalGlobal l=new LocalGlobal();
  System.out.println("Local variable:"+g);
  System.out.println("Globalvariable:"+l.n);
 }
}
/*Output:
Local variable:20
Globalvariable:10 */