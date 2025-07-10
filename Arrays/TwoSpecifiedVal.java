//12 and 23 in array verify
import java.util.*;
public class TwoSpecifiedVal
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter noof elements:");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("Enter elements:");
  for(int i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
  }
  boolean twelve=false;
  boolean twentythree=false;
  for(int i=0;i<size;i++)
  {
   if(a[i]==12)
   {
    twelve=true;
   }
   if(a[i]==23)
   {
    twentythree=true;
   }
  } 
  if(twelve && twentythree)
  {
   System.out.println("Both 12 and 23 are present");
  }
  else if(twelve )
  {
   System.out.println("12 is present");
  }
  else if(twentythree )
  {
   System.out.println("23 is present");
  }
  else
  {
   System.out.println("12 and 23 are not present");
  }
 }
}
/*Output:
Enter noof elements:
5
Enter elements:
12
23
43
21
23
Both 12 and 23 are present */
