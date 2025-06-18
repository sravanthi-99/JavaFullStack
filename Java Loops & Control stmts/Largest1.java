//Largest among 10,20,30
public class Largest1
{
 public static void main(String[] args)
 {
  int a=10;
  int b=20;
  int c=30;
  if(a==b&&b==c)
  {
   System.out.println("All are same");
  }
  else if(a>b&&a>c)
  {
   System.out.println(a+" is large");
  }
  else if(b>c)
  {
   System.out.println(b+" is large");
  }
  else
  {
   System.out.println(c+" is large");
  }
 }
}
/*Output:
30 is large*/