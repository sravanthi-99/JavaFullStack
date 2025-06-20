//Minimum and maximum element*/
import java.util.*;
public class MinMax
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int a[]=new int[size];
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  int min=a[0];
  int max=a[0];
  for(int i=0;i<size;i++)
  {
   if(min>a[i])
   {
    min=a[i];
   }
  }
  for(int i=0;i<size;i++)
  {
   if(max<a[i])
   {
    max=a[i];
   }
  }
  System.out.println("Maximum="+max);
  System.out.println("Minimum="+min);
 }
}
/*Output:
5
23
132
3454
23
123
Maximum=3454
Minimum=23 */
