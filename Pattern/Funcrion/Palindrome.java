import java.util.*;

public class Palindrome {
    public static boolean is_palindrome(int n) {
        int Palindrome = n;
        int rev = 0;
        while (Palindrome != 0) {
            int last_digit = Palindrome % 10;
            rev = (rev * 10) + last_digit;
            Palindrome = Palindrome/10;
        }
        if(n == rev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Palindrome = sc.nextInt();

        if(is_palindrome(Palindrome)) {
            System.out.println("Is a Palindrome");
        }
        else {
            System.out.println("Is not a Palindrome");
        }

        sc.close();

    }
}
