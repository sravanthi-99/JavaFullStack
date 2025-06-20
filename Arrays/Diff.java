//Differnce between largest and snallest value
import java.util.*;
public class Diff
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
  System.out.println("differnce:"+(max-min));
 }
}
/*Output:
5
1
2
3
4
5
differnce:4 */
