//Linear search is used to search a key element from multiple elements.
// Linear search is less used today because it is slower than binary search 
//Time complexity: O(N)
//Auxiliary Space: O(1)
import java.util.*;
public class linearsearch{
    public static int search(int arr[],int x,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("the key element is present:"+x);
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++)  
        arr[i] = sc.nextInt(); 
        System.out.println("enter the key value:");
        int x=sc.nextInt();
        search(arr, x, n);
        sc.close();

    }
    
}