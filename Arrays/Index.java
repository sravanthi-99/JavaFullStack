//Index of an array element
import java.util.*;
public class Index
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Size of array:");
  int size=sc.nextInt();
  int a[]=new int[size];
  for(int i=0;i<size;i++)
  {
    System.out.println("Element of array:");
    a[i]=sc.nextInt();
  }
  System.out.println("Index finding element in array:");
  int s=sc.nextInt();
  for(int i=0;i<size;i++)
  {
   if(a[i]==s)
   {
    System.out.println("Index of " +s+ " is "+i);
   }
  }
 }
}
/*Output:
Size of array:
5
Element of array:
12
Element of array:
123
Element of array:
434
Element of array:
456
Element of array:
56
Index finding element in array:
434
Index of 434 is 2*/