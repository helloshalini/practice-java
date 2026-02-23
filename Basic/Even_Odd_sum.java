import java.util.*;

public class Even_Odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int even_Sum = 0;
        int odd_Sum = 0;

        do {
            System.out.println("Enter a number");
            number = sc.nextInt();
            if(number % 2 == 0) {
                even_Sum += number;
            }
            else {
                odd_Sum += number;
            }

            System.out.println("If you don'twant to continue then press 0 to stop and 1 for further continue");
            choice = sc.nextInt();

        }while(choice == 1);

        System.out.println(even_Sum);
        System.out.println(odd_Sum);

        sc.close();
    }
    
}
