public class arrayq2 {
    public static int search(int arr[],int x){
        int min=minsearch(arr);
        if(arr[min]<=x&&x<=arr[arr.length-1]){
            return search(arr, min,arr.length-1, x);
        }
        else{
            return search(arr, 0,min,x);
        }
    }
    public static int search(int arr[],int l,int r,int x){
        while(l<=r){
            int mid =l+(r-l)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static int minsearch(int []arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid>0&&arr[mid-1]>arr[mid]){
                return mid;

            }
            else if(arr[left]<=arr[mid]&&arr[mid]>arr[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8,1,2};
        System.out.println(search(arr, 4));
        System.out.println(search(arr, 0, arr.length, 5));
        System.out.println(minsearch(arr));
    }
    

    
}
