//Even or odd using switch
import java.util.*;
public class SwitchEvenOdd
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  switch(n%2)
  {
   case 0:
   {  
    System.out.println(n+" is even");
    break;
   }
   case 1:
   {  
    System.out.println(n+" is odd");
    break;
   }
   default:
   {
    System.out.println("Neither even or odd");
    break;
  }
 }
}
/*Output:
10
10 is even

D:\5F2>java SwitchEvenOdd
123145
123145 is odd */