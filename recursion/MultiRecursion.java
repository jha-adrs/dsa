import java.util.ArrayList;

/**
 * MultiRecursion
 * Time Complexity: 2^n exponential
 * 
 */
public class MultiRecursion {

    public static void main(String[] args) {
        System.out.println("Fibinacci");
        int n = 4; // Get the 5th fibonacci nunmber
        int res = fibo(n);
        System.out.println(res);

        int arr[] = new int[] {
                3, 1, 2,4
        };
        ArrayList<Integer> local = new ArrayList<>();
        System.out.println("SUBSEQUENCE");
        printSubsequences(0, local, arr);
    }

    public static int fibo(int n) {
        if (n <= 1) {
            // No need in sum
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);

    }

    /**
     * Approach: Print all sub sequences of a array
     * Time Complextity: 2^n *n
     * Space Complexity: n
     */
    public static void printSubsequences(int i, ArrayList<Integer> arr, int original[]) {
        if (i >= original.length) {
            for(int x: arr) System.out.print(x + " ");
            System.out.println();
            if(arr.size() == 0) {
                System.out.println("{}");
            }
            return;
        }
        arr.add(original[i]); // INlucde the current on then continue recursion
        printSubsequences(i + 1, arr, original);
        // Now without this one
        arr.remove(arr.size()-1);
        printSubsequences(i + 1, arr, original);

    }
}