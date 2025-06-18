//Palindrome or not
import java.util.*;
public class Palindrome
{
 public static void main(String[] args)
 {
  Scanner sc =new Scanner(System.in);
  int n=sc.nextInt();
  int rev=0;
  int temp=n;
  while(temp>0)
  {
   int r=temp%10;
   rev=rev*10+r;
   temp/=10;
  }
  if(n==rev)
  {  
   System.out.println(n+" is Palindrome");
  }
  else
  { 
   System.out.println(n+" is not Palindrome");
  }
 }
}
/*Output:
121
121 is Palindrome

D:\5F2>java Palindrome
123
123 is not Palindrom */