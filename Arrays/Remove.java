//Remove a specific element
import java. util. *;
public class Remove
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
  System.out.println("Enter noof elements:");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("removing element:");
        int e=sc.nextInt();
        int count=0;
        System.out.println("Elements:");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) 
        {
            if(a[i]!=e) 
            {
                count++;
            }
        }
        int b[]=new int[count];
        int j=0;
        for (int i=0;i<size;i++) 
        {
            if(a[i]!=e) 
            {
                b[j]=a[i];
                j++;
            }
        }
        System.out.println("after removing");
        for (int i=0;i<count;i++) 
        {
            System.out.print(b[i] + " ");
        }
    }
}
/*Output:
Enter noof elements:
5
removing element:
3
Elements:
1
2
3
4
5
after removing
1 2 4 5 */