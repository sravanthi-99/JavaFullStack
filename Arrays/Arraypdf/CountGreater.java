//greater than a given value in an array
import java.util.*;
public class CountGreater
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
  System.out.print("Enter the value to compare: ");
  int value=sc.nextInt();
  int count=0;
  for(int i=0;i<size;i++)
  {
   if(a[i]>value)
   {
    count=count+1;
   }
  }
  System.out.println("Noof elements greater than "+value+": "+count);
 }
}
/*Output:
Enter array size: 5
Enter array elements:
23
12
36
78
56
Enter the value to compare: 50
Noof elements greater than 50: 2  */