public class Bino_Coeff {

    public static int fact(int n) {
        int f = 1;
        for(int i = 1; i<=n; i++) {
            f = f *i;
        }
        return f;
    }

    public static int coeff(int n, int r) {
        int f1 = fact(n);
        int f2 = fact(r);
        int f1_f2 = fact(n-r);

        int ans = (f1/ (f2*f1_f2));

        return ans;

    }
    public static void main(String[] args) {
        System.out.println(coeff(5, 2));
        
    }
}
