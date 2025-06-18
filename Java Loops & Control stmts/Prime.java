 //Prime or not
import java.util.Scanner;
public class Prime
{
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(n<=1) 
  {
   System.out.println(n+" is neither prime nor composite");
   return;
   }
  boolean p=true;
  for(int i=2; i<=Math.sqrt(n); i++) 
  {
    if(n%i==0) 
    {
      p=false;
      break;
     }
    }
    if(p) 
   {
    System.out.println(n+" is prime");
   } 
   else 
   {
    System.out.println(n+" is not prime");
   }
  }
}
/*Output:
4551
4551 is not prime

D:\5F2>java Prime
5
5 is prime*/