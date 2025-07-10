//positive negative and zero elements in an array
import java.util.*;
public class PosNegZero
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter array size: ");
  int size=sc.nextInt();
  int[] a=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("Positive elements:");
  for(int i=0;i<size;i++)
  {
   if(a[i]>0)
   {
    System.out.println(a[i]+" ");
   }
  }
  System.out.println("Negative elements:");
  for(int i=0;i<size;i++)
  {
   if(a[i]<0)
   {
    System.out.println(a[i]+" ");
   }
  }
  System.out.println("Zero elements:");
  for(int i=0;i<size;i++)
  {
   if(a[i]==0)
   {
    System.out.println(a[i]+" ");
   }
  }
 }
}
/*Output:
Enter array size: 5
Enter elements:
0
-23
12
-34
45
Positive elements:
12 
45 
Negative elements:
-23 
-34 
Zero elements:
0   */