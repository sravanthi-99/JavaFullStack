//Frequency
import java.util.*;
public class Frequency
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter array size: ");
  int size=sc.nextInt();
  int[] a=new int[size];
  int[] freq = new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
   freq[i]=-1;
  }
  for(int i=0;i<size;i++)
  {
   int count=1;
   if(freq[i]!=0)
   {
    for(int j=i+1;j<size;j++)
    {
     if(a[i]==a[j])
     {
      count++;
      freq[j]=0;
     }
    }
    freq[i]=count;
   }
  }
  for(int i=0;i<size;i++)
  {
   if(freq[i]!=0)
   {
    System.out.println(a[i] + " occurs " + freq[i] + " times");
   }
  }
 }
}
/*Output:
Enter array size: 5
Enter elements:
232
432
232
567
78
232 occurs 2 times
432 occurs 1 times
567 occurs 1 times
78 occurs 1 times  */