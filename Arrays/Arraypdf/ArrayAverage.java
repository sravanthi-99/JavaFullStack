//average of all values in an array
import java.util.*;
public class ArrayAverage
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter array size: ");
  int size=sc.nextInt();
  int[] a=new int[size];
  System.out.println("Enter array elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  int sum=0;
  for(int i=0;i<size;i++)
  {
   sum=sum+a[i];
  }
  float avg=sum/size;
  System.out.println("Average: "+avg);
 }
}
/*Output:
Enter array size: 5
Enter array elements:
12
12
12
12
12
Average: 12.0  */