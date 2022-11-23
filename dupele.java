import java.util.HashMap;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.HashMap;
//import java.util.Set;
import java.util.Map;
public class dupele {
    public static void finddupele(int arr[])
    {
        Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int x : arr){
            if(!hm.containsKey(x))
            {
                hm.put(x,1);
            }
            else{
                hm.put(x,hm.get(x)+1);//hm.get(x)+1 will get count of previse value if the element has already iterated
            }
        }
        for(Integer x:hm.keySet())
        {
            if(hm.get(x)>1)
            {
                System.out.println("Duplicate element is:"+x);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,5,6,7,11,8,2,9,5,7};
        finddupele(arr);
    }

    
}
