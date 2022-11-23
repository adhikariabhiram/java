import java.util.HashSet;

public class arrayq1 {//time complexcity =o(n^2)
    public static boolean dup(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean dupele(int num[]){//time complexcity =o(n)
        HashSet<Integer>s= new HashSet<>();
        for(int i=0; i<num.length; i++) 
        {
            if(s.contains(num[i])){
                return true;
            }
            else{
                s.add(num[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 1 };
        int num[] = { 1, 4, 6, 1 };
        System.out.println(dup(arr));
        System.out.println(dupele(num));
    }

}
 