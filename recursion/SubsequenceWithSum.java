import java.util.ArrayList;

public class SubsequenceWithSum {
    public static int K = 20;

    public static void main(String[] args) {
        // Print subsequence with sum of k
        int arr[] = new int[] {
                30, 10, 20, -30, 10, -20
        };

        sumK(0, new ArrayList<Integer>(), arr, 0);
    }

    public static void sumK(int i, ArrayList<Integer> arr, int[] original, int sum) {
        if (sum == K) {
            for (int x : arr)
                System.out.print(x + " ");
                System.out.println();
            if (arr.size() == 0) {
                // For null set
                System.out.println("{}");
            }
        }
        if (i >= original.length) {
            return;
        }
        
        arr.add(original[i]);
        sumK(i + 1, arr, original, sum + original[i]);
        arr.remove(arr.size() - 1);
        sumK(i + 1, arr, original, sum);

    }
}
