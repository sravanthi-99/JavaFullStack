//Differnce between largest and snallest value
import java.util.*;
public class Diff
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
  System.out.println("differnce:"+(max-min));
 }
}
/*Output:
Enter noof elements:
5
Enter elements:
1
2
3
4
5
differnce:4 */