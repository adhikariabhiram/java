import java.util.*;

public class arrayq3 
{
    public static List<List<Integer>> sum(int arr[])
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                for(int k=j+1; k<arr.length; k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        List<Integer>triple=new ArrayList<Integer>();
                        triple.add(arr[i]);
                        triple.add(arr[j]);
                        triple.add(arr[k]);
                        Collections.sort(triple);
                        result.add(triple);
                    }

                }
            }
        }
        result=new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }
    public static void main(String[] args) 
    {
        int arr[]={-1,0,1,2,-1,-4};
        System.out.println(sum(arr));

    }
}
    

