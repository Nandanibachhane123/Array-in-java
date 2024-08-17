public class _42arr_odd
 {
    public static void main(String[] args) 
    {
        System.out.println("sum of add number");
        int arr []={1,2,3,4,5,6,7,8};
        int odd = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                odd+=arr[i];
            }
        }
            System.out.println(odd);
        
    }
}
