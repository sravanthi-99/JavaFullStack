//pairs in an array whose sum equals a given number
import java.util.*;
public class PairSum
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter array size:");
  int size=sc.nextInt();
  int[] a=new int[size];
  System.out.println("Enter array elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.print("Enter the target sum:");
  int target=sc.nextInt();

  System.out.println("Pairs with sum "+target+":");
  for(int i=0;i<size-1;i++)
  {
   for(int j=i+1;j<size;j++)
   {
    if(a[i]+a[j]==target)
    {
     System.out.println(a[i]+"+"+a[j]+"="+target);
    }
   }
  }
 }
}
/*Output:
Enter array size:5
Enter array elements:
23
34
12
33
43
Enter the target sum:45
Pairs with sum 45:
12+33=45   *.