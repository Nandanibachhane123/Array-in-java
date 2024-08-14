class shortarray
{
    public static void main(String[] args) 
    {
        int arr [] = {5,2,7,9,1};
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                int tem = 0;
                if(arr[i]>arr[j])
                {
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
            
            System.out.println(arr[i]);
        }
    }
}
