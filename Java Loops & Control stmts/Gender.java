//Male or female using switch
import java.util.*;
public class Gender
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  char n=sc.next().charAt(0);
  switch(n)
  {
   case 'M':
   {  
    System.out.println(n+" is Male");
    break;
   }
   case 'F':
   {  
    System.out.println(n+" is Female");
    break;
   }
   default:
   {
    System.out.println("Invalid input");
    break;
   }
  }
 }
}
/*Output:
M
M is Male

D:\5F2>java Gender
F
F is Female

D:\5F2>java Gender
O
Invalid input */