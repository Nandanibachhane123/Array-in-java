import java.util.Scanner;
public class _39_2Darraymulti 
{
    public static void main(String[] args) 
    {
       int arr1 [][] = new int [2][2];
       int arr2 [][] = new int [2][2];
       int arr3 [][] = new int [2][2];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter  of the first array element");
       for(int i = 0; i<2;i++)
       {
        for(int j = 0;j<2;j++)
          {
             arr1[i][j] = sc.nextInt();
          } 
        }
       

       System.out.println("element of the second array");
       for(int i = 0;i<2;i++)
       {
         for(int j= 0;j<2;j++)
                     
            {
               arr2[i][j] = sc.nextInt();
            }
         }
       

       for(int i=0;i<2;i++)
       {
         for(int j = 0;j<2;j++)
          {
             arr3[i][j] = 0;
             for(int k= 0;k<2;k++)
            {
               arr3[i][j] = arr1[i][j] * arr2[i][j];
            }
         }
       }
       

       for(int i=0;i<2;i++)
       {
         for(int j=0;j<2;j++)
           { 
              System.out.print(arr3[i][j] + " ");
           }
               System.out.println();
        }
     }
   }


