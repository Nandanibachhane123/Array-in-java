import java.util.Scanner;
 class ArraySymmetric 
{
    public static void main(String []args)
    {
        int a1[][]=new int[2][2];
        int a2[][]=new int[2][2];
        int a3[][]=new int[2][2];
        int count=0;
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Frist array element");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second array element");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }
       
       
        for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
          {
             if(a1[i][j]==a2[i][j])
             {
                count++;
             }
          }
     }
     if(count==4)
     {
         System.out.println("Array is symmetric");
     }
     else
     {
      System.out.println("Array is not Symmetric");
     }
}
}
