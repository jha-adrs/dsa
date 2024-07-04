import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //Only sinlg eword
        boolean result = find(input, input.length(), 0);
        System.out.println(result == true ? "Palindrome" : "Not palindrome");
        sc.close();
    }

    public static boolean find(String st, int len, int i) {
        if( i > len/2){
            return true;
        } 
        if(st.charAt(i) != st.charAt(len - i-1)){
            return false;
        }
        return find(st, len, i+1);
    }
}
