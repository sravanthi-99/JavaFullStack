//Arithmetic Operators
import java.util.*;
public class ArithmeticOperators
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println("Add="+ (a+b));
  System.out.println("Sub="+ (a-b));
  System.out.println("Mul="+ (a*b));
  System.out.println("Div="+ (a/b));
  System.out.println("Rem="+(a%b));
 }
}