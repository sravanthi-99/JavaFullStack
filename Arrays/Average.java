//Average integer values of an array
import java.util.*;
public class Average
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter noof elements:");
  int sum=0;
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
  float avg=sum/(a.length());
  System.out.println("Average:"+avg);
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
Average:3.0 */