import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the size of array elements");
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("enter the element to be searched");
        // int x=sc.nextInt();
       
        // for(int i=0;i<size;i++){
        //     // System.out.println("array elements are:"+arr[i]);
           
        //     if(arr[i]==x)
        //     {
                
        //         System.out.println("element found at:"+i);
        //     }
            
        // }
        // sc.close();
        System.out.println("enter the row size of array elements");
        int row=sc.nextInt();
        System.out.println("enter the col size of array elements");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }

                 
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                System.out.println("the 2d array elements are :"+arr[i][j]);
            }

        }
        sc.close();
    }
}
