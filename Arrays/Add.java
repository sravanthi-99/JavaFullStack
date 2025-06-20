//Add integer values of an array
import java.util.*;
public class Add
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int sum=0;
  System.out.println("Enter noof elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  { 
   a[i]=sc.nextInt();
  }
  for(int i=0;i<size;i++) 
  {
   sum=sum+a[i];
  }
  System.out.println("Sum:"+sum);
 }
}
/*Output:
Enter noof elements:
5
1
2
3
4
Enter elements:
5
Sum:15 */