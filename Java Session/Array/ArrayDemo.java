import java.util.Scanner;
class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
        
        for(int temp:arr)
            System.out.println(temp);

        
        //System.out.println(arr[6]);

    }
}