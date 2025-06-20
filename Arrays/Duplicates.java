//Duplicate elements in an array
import java.util.*;
public class Duplicates
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
  System.out.println("Duplicate elemnts:");
  for(int i=0;i<size;i++)
  {
   for(int j=i+1;j<size;j++)
   {
    if(a[i]==a[j])
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
Enter elements:
1
2
32
2
1
Duplicate elemnts:
1
2 */