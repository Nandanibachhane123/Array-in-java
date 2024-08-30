import java.util.Scanner;
public class _39_2DarrayDigonal 
{
    public static void main(String[] args) 
    {
       int arr1 [][] = new int [2][2];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the first arry element");
       for(int i= 0;i<2;i++)
       {
         for(int j=0;j<2;j++)
         {
            arr1[i][j] = sc.nextInt();
         }
            System.out.println(" ");
       }
       for(int i=0;i<2;i++)
       {
        for(int j=0;j<2;j++)
        {
            if(i==j)
            {
                System.out.print(arr1[i][j]);
            }
           
        }
         System.out.println();
       }

    }
}
