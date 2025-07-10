//common elements in two arrays
import java.util.*;
public class CommonElements
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter size of first array: ");
  int size1=sc.nextInt();
  int[] a=new int[size1];
  System.out.println("Enter elements:");
  for(int i=0;i<size1;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.print("Enter size of second array: ");
  int size2=sc.nextInt();
  int[] b=new int[size2];
  System.out.println("Enter elements:");
  for(int i=0;i<size2;i++)
  {
   b[i]=sc.nextInt();
  }
  System.out.println("Common elements:");
  for(int i=0;i<size1;i++)
  {
   for(int j=0;j<size2;j++)
   {
    if(a[i]==b[j])
    {
     System.out.println(a[i]);
     break;
    }
   }
  }
 }
}
/*Output:
Enter size of first array: 5
Enter elements:
4
34
35
23
22
Enter size of second array: 6
Enter elements:
2
22
45
23
45
56
Common elements:
23
22 */