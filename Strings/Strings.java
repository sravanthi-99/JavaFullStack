/*1)Different ways creating a string
import java.util.*;
public class Strings
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  String s="Sri";
  String s1=new String("Ram");
  String s2=s;
  String empty="";
  System.out.println("--Strings creation--");
  System.out.println("Enter string:");
  String s3=sc.next();
  String s4=s3;
  System.out.println(s);
  System.out.println(s1);
  System.out.println(s2);
  System.out.println(s3);
  System.out.println(empty);
  System.out.println(s4);
 }
}
Output:
--Strings creation--
Enter string:
Sravs
Sri
Ram
Sri
Sravs

Sravs  */
 
/*2)Concatenation 
public class Strings
{
 public static void main(String[] args)
 {
  String s="Sri";
  String s1=new String("Ram");
  System.out.println("--concatenation--");
  System.out.println(s+" "+s1);
 }
}
Output:
--concatenation--
Sri Ram */
 
/*3)Length
public class Strings
{
 public static void main(String[] args)
 {
  String s="Sri";
  String s1=new String("Ram");
  System.out.println("--Length--");
  System.out.println("Sri-"+s.length());
  System.out.println("Ram-"+s1.length());
  String s2=s+s1;
  System.out.println("SriRam-"+s2.length());
  String s3=s+" "+s1;
  System.out.println("Sri Ram-"+s3.length());
 }
}
Output:
--Length--
Sri-3
Ram-3
SriRam-6
Sri Ram-7 */

/*4)Substring
public class Strings
{
 public static void main(String[] args)
 {
  String s="Sri Ram";
  System.out.println("--Substring--");
  System.out.println(s.substring(4));
  System.out.println(s.substring(3));
 }
}
Output:
--Substring--
Ram
 Ram */

/*5)Searching in strings using indexOf
public class Strings
{
 public static void main(String[] args)
 {
  String s="Sri Ram";
  System.out.println("--Indexof--");
  System.out.println(s.indexOf(" "));
 }
}
Output:
--Indexof--
3*/

/*6)Matches in regular expressions
 public class Strings 
{
 public static void main(String[] args) 
 {
  String s="Sravs";
  boolean re1=s.matches("[a-zA-Z]+");
  System.out.println("--Matches--");
  System.out.println(re1);
  String s1="918273645a";
  boolean re2=s1.matches("[0-9]+");
  System.out.println(re2);
  String s2="sravsparisegmail.com";
  boolean re3=s2.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com");
  System.out.println(re3);
  String s3="9876543210";
  boolean re4=s3.matches("\\d{10}");
  System.out.println(re4);
  String s4="23-11-2004";
  boolean re5=s4.matches("\\d{2}-\\d{2}-\\d{4}");
  System.out.println(re5);
 }
}
Output:
--Matches--
true
false
false
true
true  */

/*7)Equals
public class Strings
{
 public static void main(String[] args)
 {
  String s="sri";
  String s1="SRI";
  String s2=s;
  System.out.println("--Equals--");
  System.out.println("sri==sri: "+s.equals(s2));
  System.out.println("sri==SRI: "+s.equals(s1));
 }
}
Output:
--Equals--
sri==sri:true
sri==SRI:false */

/*8)equalsIgnoreCase,startsWith,endsWith,compareTo
public class Strings
{
 public static void main(String[] args)
 {
  String s="sri";
  String s1="SRI";
  String s3="ram";
  System.out.println("--equalsIgnoreCase--");
  System.out.println("sri==SRI : "+s.equalsIgnoreCase(s1));
  System.out.println("sri==ram : "+s.equalsIgnoreCase(s3));
  System.out.println("--startsWith--");
  System.out.println(s1.startsWith("s"));
  System.out.println("--endsWith--");
  System.out.println(s3.endsWith("m"));
  System.out.println("--compareTo--");
  int val=s1.compareTo(s);
  if(val==0)
  {
   System.out.println("Strings are same");
  }
  else if(val>0)
  {
   System.out.println("Positive");
  }
  else
  {
   System.out.println("Negative");
  }
  System.out.println(val);
 }
}
Output:
--equalsIgnoreCase--
sri==SRI : true
sri==ram : false
--startsWith--
false
--endsWith--
true
--compareTo--
Negative
-32   */

/*9)trim
public class Strings
{
 public static void main(String[] args)
 {
  String s="   Sri Ram   ";
  System.out.println("--trim--");
  System.out.println("Before trim :"+s);
  System.out.println("After trim :"+s.trim());
 }
}
Output:
--trim--
Before trim :   Sri Ram
After trim :Sri Ram  */

/*10)Replace
public class Strings
{
 public static void main(String[] args)
 {
  String s=" Sri Ram ";
  System.out.println("--replace--");
  System.out.println(s.replace(" ","@"));
 }
}
Output:
--replace--
@Sri@Ram@   */

/*11)Split
public class Strings
{
 public static void main(String[] args)
 {
  String s="Sri,Ram.Nandhu Sravs ";
  System.out.println("--split--");
  String r="[,\\s\\.]";    //comma(\\,) spaces(\\s) fullstop(\\.)
  String a[]=s.split(r);
  for(int i=0;i<a.length;i++)
  {
   System.out.println(a[i]); 
  }
 }
}
Output:
--split--
Sri
Ram
Nandhu
Sravs  */

/*12)ValueOf
public class Strings 
{
 public static void main(String[] args) 
 {
  int i=10;
  String s=String.valueOf(i);
  System.out.println("--Integer to string--");
  System.out.println(s);
  float f=45.67f;
  String s1=String.valueOf(f);
  System.out.println("--Float to string--");
  System.out.println(s1);
  double d=200.62;
  String s2=String.valueOf(d);
  System.out.println("--Double to string--");
  System.out.println(s2);
  boolean b=true;
  String s3=String.valueOf(b);
  System.out.println("--Boolean to string--");
  System.out.println(s3);
  char c='s';
  String s4=String.valueOf(c);
  System.out.println("--Caracter to string--");
  System.out.println(s4);
  System.out.println("--Confirmation--");
  System.out.println(s+s1+s2+s3+s4);
 }
}
Output:
--Integer to string--
10
--Float to string--
45.67
--Double to string--
200.62
--Boolean to string--
true
--Caracter to string--
s
--Confirmation--
1045.67200.62trues */

/*12)public class Strings 
{
 public static void main(String[] args) 
 {
  Integer i=23;
  String s=String.valueOf(i);
  System.out.println("--valueOf--");
  System.out.println(s);
  System.out.println("--toString--");
  String s1=i.toString();
  System.out.println(s1);
  System.out.println("--concatenation--");
  String s2=i+s1;
  System.out.println(s2);
 }
}
Output:
--valueOf--
23
--toString--
23
--concatenation--
2323  */

/*14)Upper case, lower case
public class Strings
{
 public static void main(String[] args)
 {
  String s="Sri Ram";
  System.out.println("--toUpperCase--");
  System.out.println(s.toUpperCase());
  System.out.println("--toLowerCase--");
  System.out.println(s.toLowerCase());
 }
}
Output:
--toUpperCase--
SRI RAM
--toLowerCase--
sri ram */

