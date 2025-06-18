//Armstrong number or not
import java.util.*;
import java.lang.Math;
public class Armstrong
{
 public static void main(String[] args)
 {
  Scanner sc =new Scanner(System.in);
  int n=sc.nextInt();
  int p=String.valueOf(n).length();
  double sum=0;
  int temp=n;
  while(temp>0)
  {
   int r=temp%10;
   sum+=Math.pow(r,p);
   temp/=10;
  }
  if(n==sum)
  {  
   System.out.println(n+" is armstrong number");
  }
  else
  { 
   System.out.println(n+" is not armstrong number");
  }
 }
}
/*Output:
1534
1534 is not armstrong number

D:\5F2>java Armstrong
153
153 is armstrong number */