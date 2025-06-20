//Copy one array to another array\
import java.util.*;
public class CopyArray
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int a[]=new int[size];
  int b[]=new int[size];
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.print("a[]={");
  for(int i=0;i<size;i++)
  {
   System.out.print(" "+a[i]+" ");
  }
  System.out.println("}");
  for(int i=0;i<size;i++)
  {
   b[i]=a[i];
  }
  System.out.print("b[]={");
  for(int i=0;i<size;i++)
  {
   System.out.print(" "+b[i]+" ");
  }
  System.out.println("}");
 }
}
/*Output:
5
1
2
3
4
5
a[]={ 1  2  3  4  5 }
b[]={ 1  2  3  4  5 } */
  