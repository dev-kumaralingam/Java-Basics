import java.util.Scanner;
class Array2DDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];

        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                arr[i][j] = sc.nextInt();
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)          
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
}