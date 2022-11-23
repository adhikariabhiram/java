// Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
// The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n). 
import java.util.*;
public class binarysearch {
    int bsearch(int arr[],int low,int high,int x)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        binarysearch b=new binarysearch();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println("sorted array is:");
        for (int i = 0; i < arr.length; i++)   
        {       
            System.out.println(arr[i]);   
        }  
        System.out.println("enter the key value to be searched:");
        int x=sc.nextInt();
        int result = b.bsearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + x);
        sc.close();                       

    }


    
}
