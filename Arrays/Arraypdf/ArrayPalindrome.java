//check if an array is palindrome or not
import java.util.*;
public class ArrayPalindrome
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter array size:");
  int size=sc.nextInt();
  int[] a=new int[size];
  System.out.println("Enter array elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  boolean isPalindrome=true;
  for(int i=0;i<size/2;i++)
  {
   if(a[i]!=a[size-1-i])
   {
    isPalindrome=false;
    break;
   }
  }
  if(isPalindrome)
  {
   System.out.println("The array is a Palindrome");
  }
  else
  {
   System.out.println("The array is not a Palindrome");
  }
 }
}
/*Output:
Enter array size:5
Enter array elements:
1
2
3
2
1
The array is a Palindrome 

Enter array size:6
Enter array elements:
121
23
12
3
45
65
The array is not a Palindrome */