public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Reverse Array");
        int arr[] = new int[]{
            1,2,3,4,5
        };
        reverseArrayInPlace(0, arr, arr.length);
        for(int x: arr) {
            System.out.println(x + " ");
        }

    }

    public static void reverseArrayInPlace(int i , int arr[], int n) {
        if( i>= n/2) {
            return;
        }
        arr[i] = arr[i] + arr[n-i-1];
        arr[n-i-1] = arr[i] -arr[n-i-1];
        arr[i] = arr[i] - arr[n-i-1];
    }
}