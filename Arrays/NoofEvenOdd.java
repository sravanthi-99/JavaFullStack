//Number of even and odd numbers
import java.util.*;
public class NoofEvenOdd
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
  int count=0;
  int flag=0;
  for(int i=0;i<size;i++)
  {
   if(a[i]%2==0)
   {
    count++;
   }
   else
   {
    flag++;
   }
  }
  System.out.println("|Noof even numbers:"+count);
  System.out.println("|Noof odd numbers:"+flag);
 }
}
/*Output:
5
1
2
3
4
5
differnce:4 */
