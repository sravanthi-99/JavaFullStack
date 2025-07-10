//multiply two matrices
import java.util.*;
public class MatrixMultiplication
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter noof rows for first matrix: ");
  int r1=sc.nextInt();
  System.out.print("Enter noof columns for first matrix: ");
  int c1=sc.nextInt();
  System.out.print("Enter noof rows for second matrix: ");
  int r2=sc.nextInt();
  System.out.print("Enter noof columns for second matrix: ");
  int c2=sc.nextInt();
  if(c1!=r2)
  {
   System.out.println("Matrix multiplication not possible");
   return;
  }
  int[][] a=new int[r1][c1];
  int[][] b=new int[r2][c2];
  int[][] res=new int[r1][c2];

  System.out.println("Enter elements of first matrix:");
  for(int i=0;i<r1;i++)
  {
   for(int j=0;j<c1;j++)
   {
    a[i][j]=sc.nextInt();
   }
  }

  System.out.println("Enter elements of second matrix:");
  for(int i=0;i<r2;i++)
  {
   for(int j=0;j<c2;j++)
   {
    b[i][j]=sc.nextInt();
   }
  }

  for(int i=0;i<r1;i++)
  {
   for(int j=0;j<c2;j++)
   {
    res[i][j]=0;
    for(int k=0;k<c1;k++)
    {
     res[i][j]=res[i][j]+a[i][k]*b[k][j];
    }
   }
  }
  System.out.println("Product of the matrices:");
  for(int i=0;i<r1;i++)
  {
   for(int j=0;j<c2;j++)
   {
    System.out.print(res[i][j]+" ");
   }
   System.out.println();
  }
 }
}
/*Output:
Enter noof rows for first matrix: 2
Enter noof columns for first matrix: 3
Enter noof rows for second matrix: 3
Enter noof columns for second matrix: 3
Enter elements of first matrix:
5

1
2
4
2
4
Enter elements of second matrix:
5
1
2
3
4
5
6
7
8
Product of the matrices:
40 23 31 
50 40 50   */