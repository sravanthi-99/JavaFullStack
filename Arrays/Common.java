//Common elements in 2 arrays
import java.util.*;
public class Common
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Noof elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  int b[]=new int[size];
  System.out.println("Enter elements in 1st array:");
  for(int i=0;i<size;i++)
  { 
   a[i]=sc.nextInt();
  }
  System.out.println("Enter elements in 2nd array:");
  for(int i=0;i<size;i++)
  { 
   b[i]=sc.nextInt();
  }
  System.out.println("Common elemnts:");
  for(int i=0;i<size;i++)
  {
   for(int j=0;j<size;j++)
   {
    if(a[i]==b[j])
    {
     System.out.println(a[i]);
    }
   }
  }
 }
}
/*Output:
Noof elements:
5
Enter elements in 1st array:
1
2
3
4
5
Enter elements in 2nd array:
6
7
8
1
8
Common elemnts:
1*/