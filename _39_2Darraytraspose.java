public class _39_2Darraytraspose 
{
    public static void main(String[] args) 
    {
        int arr1 [][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Printing Matrix without tanpose");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr1[i][j]+ "");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After tanpose");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr1[j][i]+ "");
            }
            System.out.println();
    }
}
}
