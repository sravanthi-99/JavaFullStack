//Reverse values of an array
import java.util.*;
public class Reverse
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int sum=0;
  int size=sc.nextInt();
  int a[]=new int[size];
  for(int i=0;i<size;i++)
  { 
   a[i]=sc.nextInt();
  }
  System.out.println("Before reverse:");
  for(int i=0;i<size;i++) 
  {
   System.out.println(a[i]);
  }
  System.out.println("After reverse:");
  for(int i=size-1;i>=0;i--) 
  {
   System.out.println(a[i]);
  }
 }
}