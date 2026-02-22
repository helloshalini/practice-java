import java.util.*;

public class user_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a number");
        int n = sc.nextInt();

        if(n >= 0) {
            System.out.println(n + " It is a positive number");
        }
        else {
            System.out.println(n + " It is a negative number");
        }

        sc.close();
    }
}
