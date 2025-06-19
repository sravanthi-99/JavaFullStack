//Create a class,object,method and its signature
public class Add
{ 
 public int add(int a,int b)
 {
  return  a+b;
 }
 public static void main(String[] args)
 {
  Add a=new Add();
  System.out.println(a.add(10,20));
 }
}
/*Output:
30*/
