import java.util.Scanner;
public class _39_2DArraysum 
{
    public static void main(String[] args) 
    {
     int aar1 [][] = new int [3][3];
     int arr2[][] = new int [3][3];
     int arr3[][] = new int [3][3];
     Scanner sc = new Scanner(System.in);
     System.out.println("enter first array element");

     for(int i= 0;i<3;i++)
     {
        for(int j = 0; j<3;j++)
        {
            aar1[i][j] = sc.nextInt();
        }
     }

     System.out.println("enter the element of 2array");
     for(int i = 0;i<3;i++)
     {
        for(int j= 0;j<3;j++)
        {
            arr2[i][j] = sc.nextInt();
        }
     }
     for(int i = 0;i<3;i++)
     {
        for(int j = 0;j<3;j++)
        {
            arr3[i][j] = arr1[i][j] + arr2[i][j];
         }
     }
     for(int i = 0; i<3;i++)
     {
        for(int j= 0;j<3;j++)
        {
            
            System.out.print(arr3[i][j]+ " ");
        }
        System.out.println();
     }

    }
}
