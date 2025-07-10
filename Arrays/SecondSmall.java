//Second smallest value
import java.util.*;
public class SecondSmall
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
  int smallest=a[0];
  for(int i=0;i<size;i++)
  {
   if(smallest>a[i])
   {
    smallest=a[i];
   }
  } 
  int secondsmall=Integer.MAX_VALUE;
  for(int i=0;i<size;i++)
  {
   if(a[i]!=smallest)
   {
    if(secondsmall>a[i])
    {
     secondsmall=a[i];
    }
  }
  }
  System.out.println("Second smallest:"+secondsmall);
 }
}
/*Output:
Enter noof elements:
5
Enter elements:
23
1
23
3
2
Second smallest:2 */
