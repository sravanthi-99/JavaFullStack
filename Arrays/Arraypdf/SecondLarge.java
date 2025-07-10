//Second largest value
import java.util.*;
public class SecondLarge
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter noof elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  int largest=a[0];
  for(int i=0;i<size;i++)
  {
   if(largest<a[i])
   {
    largest=a[i];
   }
  } 
  int slargest=Integer.MIN_VALUE;
  for(int i=0;i<size;i++)
  {
   if(a[i]!=largest)
   {
    if(slargest<a[i])
    {
     slargest=a[i];
    }
  }
  }
  System.out.println("Second largest:"+slargest);
 }
}
/*Output:
Enter noof elements:
5
Enter elements:
12
34
45
32
125
Second largest:45 */