//Array contains a specific value
import java.util.*;
public class SpecificVal
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int a[]={1,2,3,4,5};
  int s=sc.nextInt();
  boolean sv=false;
  for(int j=0;j<a.length;j++)
  {
   if(a[j]==s)
   { 
    sv=true;
   }
  }
   if(sv)
  {
  System.out.println("Array contains specific value");
  }
  else
  {
   System.out.println("Array not contains specific value");
  }
 }
}
/*Output:
3
Array contains specific value

D:\5F2>java SpecificVal
6
Array not contains specific value */