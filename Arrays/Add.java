//Add integer values of an array
import java.util.*;
public class Add
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int sum=0;
  int size=sc.nextInt();
  int a[]=new int[size];
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
5
1
2
3
4
5
Sum:15 */