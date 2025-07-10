//even odd elements in an integer array
import java.util.*;
public class EvenOddElements
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
  System.out.println("Even elements:");
  for(int i=0;i<size;i++)
  {
   if(a[i]%2==0)
   {
    System.out.println(a[i]+" ");
   }
  }
  System.out.println("Odd elements:");
  for(int i=0;i<size;i++)
  {
   if(a[i]%2!=0)
   {
    System.out.print(a[i]+" ");
   }
  }
 }
}
/*Output:
Enter array size: 5
Enter elements:
34
112
23
34
57
Even elements:
34 
112 
34 
Odd elements:
23 57  */