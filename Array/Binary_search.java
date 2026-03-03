public class Binary_search {

    public static int bin_ser(int n[], int key) {
        int st = 0, end = n.length - 1;
        while (st <= end) {
            int mid = (st + end)/2;

            if(n[mid] == key) {
                return mid;
            }

            else if (n[mid] < key) {
                st = mid + 1;
            }
            else{
                end = mid -1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int n[] = {2, 6, 8, 14, 19, 23};
        int key = 19;

        System.out.println(bin_ser(n, key));
    }
    
}
