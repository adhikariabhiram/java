// Iterative java program to reverse an
// array
public class reverse {

    /*
     * Function to reverse arr[] from
     * start to end
     */
    static void rvereseArray(int arr[],
            int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Driver code
    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        rvereseArray(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
