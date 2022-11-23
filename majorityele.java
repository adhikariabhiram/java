import java.util.*;
public class majorityele {
    public static int majority(int arr[],int low ,int high)
    {
        if(low==high)
        {
            return arr[low];
        }
        else{
            int mid=(low+high)/2;
            int left=majority(arr,low,mid);
            int right=majority(arr,mid+1,high);
            if(left==right){
                return left;
            }
            int lcount=count(arr,low,high,left);
            int rcount=count(arr,low,high,right);
            if(lcount>rcount){
                return left;
            }
            else{
                return right;
            }
        }
    }
    public static int count(int arr[],int low,int high,int x,) 
    {
        int ct=0;
        
        for(int i=1;i<n;i++)
        {
            if(x==arr[i]){
                ct++;
            }
            return ct;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for (int x = 0; x < n; x++)  
        arr[x] = sc.nextInt();
        count(arr,0,n-1,0);
        System.out.println("marity element in array is:");
        
    }
    
}
