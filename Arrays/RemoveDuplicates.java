//Removing duplicate elements in array
import java.util.*;
public class RemoveDuplicates
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Noof elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  { 
   a[i]=sc.nextInt();
  }
  System.out.println("After removing duplicates:");
  for(int i=0;i<size;i++)
  {
   boolean dup=false;
   for(int j=0;j<i;j++)
   {
    if(a[i]==a[j])
    {
     dup=true;
     break;
    }
   }
   if(!dup)
   {
     System.out.println(a[i]+" ");
   }
  }
 }
}
/*Output:
Noof elements:
5
Enter elements:
12
23
23
56
23
After removing duplicates:
12
23
56*/