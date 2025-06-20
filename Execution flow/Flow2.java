class Flow1
{
 static int a=5;
 static int b=10;
 int c=150;
 int d=20;
 static
 {
  System.out.println("----First class----");
  System.out.println("Static block 1:"+a);
 }
 static
 {
  System.out.println("----First class----");
  System.out.println("Static block 2:"+b);
 }
 {
  System.out.println("----First class----");
  System.out.println("Instance block 2:"+c);
 }
 {
  System.out.println("----First class----");
  System.out.println("Instance block 2:"+d);
 }
 static void add()
 {
  System.out.println("----First class----");
  System.out.println("Static method 1:"+(a+b));
 }
 static void sub()
 {
  System.out.println("----First class----");
  System.out.println("Static method 2:"+(a-b));
 }
 void mul()
 {
  System.out.println("----First class----");
  System.out.println("Instance method 1:"+(c*d));
 }
 void div()
 {
  System.out.println("----First class----");
  System.out.println("Instance method 2:"+(c/d));
 }
}
class Flow2
{
 static int a1=6;
 static int b1=3;
 int c1=4;
 int d1=2;
 static
 {
  System.out.println("----Second class----");
  System.out.println("Static block 3:"+a1);
 }
 static
 {
  System.out.println("----Second class----");
  System.out.println("Static block 4:"+b1);
 }
 {
  System.out.println("----Second class----");
  System.out.println("Instance block 3:"+c1);
 }
 {
  System.out.println("----Second class----");
  System.out.println("Instance block 4:"+d1);
 }
 static void add1()
 {
  System.out.println("----Second class----");
  System.out.println("Static method 3:"+(a1+b1));
 }
 static void sub1()
 {
  System.out.println("----Second class----");
  System.out.println("Static method 4:"+(a1-b1));
 }
 void mul1()
 {
  System.out.println("----Second class----");
  System.out.println("Instance method 3:"+(c1*d1));
 }
 void div1()
 {
  System.out.println("----Second class----");
  System.out.println("Instance method 4:"+(c1/d1));
 }
 public static void main(String[] args)
 {
  System.out.println("****Main method****");
  Flow1 f1=new Flow1();
  Flow2 f2=new Flow2();
  Flow1 f=new Flow1();
  Flow1.add();
  Flow1.sub();
  f1.mul();
  f1.div();
  add1();
  sub1();
  f2.mul1();
  f2.div1();
 }
}

 
 