import java.util.Scanner;
 class arrinput {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i =0;i<arr.length;i++)
        {
        System.out.println("inter the number");
        arr[i] = sc.nextInt();
        System.out.println("Array atindex"+i+"is"+arr[i]);
        
    }
    
}
 }
