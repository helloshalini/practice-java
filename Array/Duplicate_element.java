import java.util.Arrays;

public class Duplicate_element {
    public static boolean dup_ele(int n[]) {
        Arrays.sort(n);

        for(int i = 0; i<n.length-1; i++) {
            if( n[i] == n[i+1] ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1};
        // int arr[] = {1, 2, 3, 4};
        System.out.println(dup_ele(arr));
    }
}
