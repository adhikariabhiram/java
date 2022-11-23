
public class maxsubarrsum {
    public static void maxsum(int arr[]){
        int max=Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<arr.length;i++){
            cursum+=arr[i];
            if(cursum<0){
                cursum=0;
            }
            max=Math.max(cursum,max);
        }
        System.out.println("maximum sub array sum:"+max);

    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxsum(arr);
    }
    
    
}
