public class check_prime {
    public static void main(String[] args) {
        int n = 10;
        int div = 2;

        while (div < n) {
            if(n % div == 0) {
                System.out.println("Not Prime number");
            }
            else
                div--;
                System.out.println("Prime number");
        }
    }

}
