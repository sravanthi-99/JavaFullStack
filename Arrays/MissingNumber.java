//Miising value in 1 to 100
public class MissingNumber 
{
 public static void main(String[] args) 
 {
  int[] a=new int[99];
  int index=0;
  for (int i=1;i<=100;i++) 
  {
    if(i!=47) 
   {
     a[index++]=i;
    }
   }
   int sum=100*101/2;
   int add=0;
   for (int i=0;i<a.length;i++) 
  {
   add+= a[i];
  }
  int miss=sum-add;
  System.out.println("Missing number is: " + miss);
 }
}
/*Output:
Missing number is: 47*/