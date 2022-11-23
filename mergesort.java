// The sub-lists are divided again and again into halves until the list cannot be divided further. 
// Then we combine the pair of one element lists into two-element lists, sorting them in the process. 
// The sorted two-element pairs is merged into the four-element lists, and so on until we get the sorted list.
// Best Case Complexity:O(n*logn).
// Average Case Complexity:O(n*logn).
// Worst Case Complexity:O(n*logn).
import java.util.*;
public class mergesort 
{
    public static void mergesorting(int arr[],int low,int high)
    {
        if(low<high){
            int mid=(low+high)/2;
            mergesorting(arr,low,mid);
            mergesorting(arr,mid+1,high);
            merge(arr,low,mid+1,high);
         }
    }
    public static void merge(int arr[],int low,int m,int high) 
    {   
        int []temp=new int[10];
        int j=0;
        int mid=m-1;
        int lpos=low;
        while(lpos<=mid && m<=high)
        {
            if(arr[lpos]<=arr[m]){
                temp[j]=arr[lpos];
                j++;
                lpos++;
            }
            else
            {
                temp[j]=arr[m];
                j++;
                m++;
            }
        }
        while(m<=high)
        {
            temp[j]=arr[m];
            j++;
            m++;
        }
        while(lpos<=mid)
        {
            temp[j]=arr[lpos];
            j++;
            lpos++;
        }
        j=0;
        for(int i=low;i<=high;i++){
            arr[i]=temp[j++];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++)  
        arr[i] = sc.nextInt();
        mergesorting(arr, 0, n-1);
        System.out.println("elements after sorting");
        for (int i = 0; i < n; i++)  
        System.out.println(arr[i]);
        sc.close();   
    }
}
