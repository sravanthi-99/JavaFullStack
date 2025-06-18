//Largest among 3 numbers
import java.util.*;
public class LargestNum
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
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
->2
    2
    2
   All are same
->2
    3
    4
   4 is large
->32
    4
    3
    32 is large
->2
    6
    3
    6 is large*/