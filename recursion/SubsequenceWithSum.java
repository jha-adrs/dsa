import java.util.ArrayList;

public class SubsequenceWithSum {
    public static int K = 5;

    public static void main(String[] args) {
        // Print subsequence with sum of k
        int arr[] = new int[] {
                1, 2, 3, 4, 5
        };

        sumK(0, new ArrayList<Integer>(), arr, 0);

        int result = countK(0, arr, 0);
        System.out.println("COUNT: " + result);
    }

    public static void sumK(int i, ArrayList<Integer> arr, int[] original, int sum) {

        if (i >= original.length) {
            if (sum == K) {
                for (int x : arr)
                    System.out.print(x + " ");
                System.out.println();
                if (arr.size() == 0) {
                    // For null set
                    System.out.println("{}");
                }
            }
            return;
        }

        arr.add(original[i]);
        sumK(i + 1, arr, original, sum + original[i]);
        arr.remove(arr.size() - 1);
        sumK(i + 1, arr, original, sum);

    }

    public static int countK(int i, int[] original, int sum) {
        if (i >= original.length) {
            if (sum == K) {
                return 1;
            } else
                return 0;
        }

        int res1 = countK(i + 1, original, sum);
        int res2 = countK(i + 1, original, sum + original[i]);
        return res1 + res2;
    }
}
