//sum of even elements in an integer array
import java.util.*;
public class SumOfEven
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int sum=0;
  System.out.print("Enter array size: ");
  int size=sc.nextInt();
  int[] a=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  for(int i=0;i<size;i++)
  {
   if(a[i]%2==0)
   {
    sum=sum+a[i];
   }
  }
  System.out.println("Sum:"+sum);
 }
}
/*Output:
Enter array size: 5
Enter elements:
12
23
34
45
56
Sum:102  */