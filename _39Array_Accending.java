public class _39Array_Accending {
    public static void main(String[] args)
    { 
        int arr [] = {5,6,8,22,31,54,};
        for(int i = 0; i <= arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)   
            {  
               int tmp = 0;  
               if (arr[i] > arr[j])   
                 {  
                     tmp = arr[i];  
                     arr[i] = arr[j];  
                     arr[j] = tmp;  
                 }  
            }  
            //prints the sorted element of the array  
            System.out.println(arr[i]);  
            }  
         }  
      }    
        