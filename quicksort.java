import java.util.*;
public class quicksort {
    public static void qsort(int arr[], int low,int high)
    {
        if(low<high)
        {
            int i=low+1;
            int j=high;
            int pivot=arr[low];
            
            while(i<=j)
            {
                while(i<=high && arr[i]<=pivot)//if the elemrnt less than or equal to pivot incriement i
                {
                    i++;
                }
                while(j>=low && arr[j]>=pivot)//if the element greater than or equal to pivot decriement j
                {
                    j--;
                }
                if(i<j)//swaping i and j
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
            int temp=arr[j];
            arr[j]=arr[low];
            arr[low]=temp;
            qsort(arr,low,j-1);
            qsort(arr,j+1,high);
            
        }
         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for (int x = 0; x < n; x++)  
        arr[x] = sc.nextInt();
        qsort(arr, 0, n-1);
        System.out.println("elements after sorting");
        for (int x = 0; x < n; x++)  
        System.out.println(arr[x]);
        sc.close();   
    }
}
