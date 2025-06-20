//Larger and smaller among 3 numbers
import java.util.*;
public class LargerAndSmaller
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
  else
  {
   if(a>b&&a>c)
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
  if(a<b&&a<c)
  {
   System.out.println(a+" is small");
  }
  else if(b<c)
  {
   System.out.println(b+" is small");
  }
  else
  {
   System.out.println(c+" is small");
  }
 }
 }
}
    
  