//Binary Search
import java.util.*;
import java.util.Arrays;
public class BinarySearch
{
 public static void main(String[] args) 
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter number of elements: ");
  int size=sc.nextInt();
  int[] a=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++) 
  {
   a[i]=sc.nextInt();
  }
  Arrays.sort(a);
  System.out.print("Enter search key:");
  int key=sc.nextInt();
  int low=0;
  int high=size-1;
  boolean find=false;
  while(low<=high) 
  {
   int mid=(low+high)/2;
   if(a[mid]==key) 
   {
    System.out.println("Element found at index:" + mid);
    find=true;
    break;
   } 
   else if(a[mid]<key) 
   {
    low=mid+1;
   } 
   else 
   {
    high=mid - 1;
   }
  }
  if(!find) 
  {
   System.out.println("Element not found");
  }
 }
}
/*Output:
Enter number of elements: 5
Enter elements:
32
54
12
44
10
Enter search key:10
Element found at index:0   */
