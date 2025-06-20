//Reverse values of an array
import java.util.*;
public class Reverse
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
  System.out.println("After reverse:");
  for(int i=size-1;i>=0;i--) 
  {
   System.out.println(a[i]);
  }
 }
}
/*Output:
Enter noof elements:
5
Enter elements:
23
12
12
433
45
After reverse:
45
433
12
12
23*/