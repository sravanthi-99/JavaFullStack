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