//Inserting an element at specific position*/
import java.util.*;
public class Insert
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int a[]=new int[size];
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.print("Initial:");
  for(int i=0;i<size;i++)
  {
   System.out.print(a[i]+" ");
  }
  int pos=3;
  int ele=9;
  int b[]=new int[size+1];
  for(int i=0;i<size+1;i++)
  {
   if(i<pos-1)
   {
    b[i]=a[i];
   }
   else if(i==pos)
   {
    b[i]=ele;
   }
   else
   {
    b[i]=a[i-1];
   }
  }
  System.out.println();
  System.out.print("After inserting:");
  for(int i=0;i<b.length;i++)
  {
   System.out.print(b[i]+" ");
  }
 }
/*Output:
Enter noof elements:
5
Enter elements:
1
2
2
4
5
Initial:1 2 2 4 5
After inserting:1 2 2 9 4 5 */
}