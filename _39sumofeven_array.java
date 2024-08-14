public class _39sumofeven_array {
    public static void main(String[] args)
    {
        int arr1 [] = {1,2,3,4,5,6,7,8,9};
         System.out.print("sum of even number is:" );
         int sum = 0;
         for (int i = 0; i < arr1.length; i++) {
             if (arr1[i] % 2 == 0) {
                 sum += arr1[i];
             }
            }
            System.out.println(sum);
        }

    }