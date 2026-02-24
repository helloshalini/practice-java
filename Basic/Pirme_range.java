public class Pirme_range {
    
    public static boolean prime(int n) {
        boolean is_Prime = true;
        for(int i = 2; i<=n-1; i++) {
            if(n%i == 0) {
                is_Prime = false;
            }
        }
        return is_Prime;
    }

    public static void primeInRange(int n) {
        for(int i = 2; i<=n; i++) {
            if(prime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // System.out.println(primeInRange(10))
        primeInRange(10);
    }
}
